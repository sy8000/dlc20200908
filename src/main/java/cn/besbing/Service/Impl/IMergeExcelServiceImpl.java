package cn.besbing.Service.Impl;

import cn.besbing.Conctrollers.LimsFlagController;
import cn.besbing.Service.IMergeExcelService;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import com.spire.pdf.PdfDocument;
import com.spire.pdf.PdfPageBase;
import com.spire.pdf.exporting.PdfImageInfo;
import com.spire.pdf.graphics.PdfBitmap;
import org.apache.commons.io.IOUtils;
import org.apache.pdfbox.io.MemoryUsageSetting;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdfparser.PDFStreamParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.text.PDFTextStripper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.io.*;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.spire.xls.*;

import com.aspose.cells.*;

@Service
public class IMergeExcelServiceImpl implements IMergeExcelService {






    private static final int XLS_MAX_ROWS = 65535;
    private static final int XLSX_MAX_ROWS = 1048575;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 合并多个 Excel 文件
     *
     * @param mergedFile 合并后的文件
     * @param files      待合并的文件
     * @param isXlsx     合并文件类型是否是 xlsx
     * @throws IOException       合并异常
     */
    public void mergeExcel(File mergedFile, List<File> files, boolean isXlsx) throws IOException {
        if (mergedFile == null || files == null) {
            return;
        }
        try (Workbook mergedWorkbook = isXlsx ? new SXSSFWorkbook() : new HSSFWorkbook();
             FileOutputStream out = new FileOutputStream(mergedFile)) {
            Sheet newSheet = mergedWorkbook.createSheet();
            int start = 0;
            for (File file : files) {
                if (file == null) {
                    continue;
                }
                try (Workbook oldWorkbook = isXlsx ? new XSSFWorkbook(new FileInputStream(file)) : new HSSFWorkbook(new FileInputStream(file))) {
                    int oldSheetSize = oldWorkbook.getNumberOfSheets();
                    for (int i = 0; i < oldSheetSize; i++) {
                        Sheet oldSheet = oldWorkbook.getSheetAt(i);
                        int oldRowSize = oldSheet.getLastRowNum();
                        for (int j = 0; j <= oldRowSize; j++) {
                            if (start == (isXlsx ? XLSX_MAX_ROWS : XLS_MAX_ROWS)) {
                                newSheet = mergedWorkbook.createSheet();
                                start = newSheet.getLastRowNum();
                            }
                            Row oldRow = oldSheet.getRow(j);
                            Row newRow = newSheet.createRow(start);
                            copyRow(oldRow, newRow);
                            start++;
                        }
                    }
                }catch (Exception e ){
                    e.printStackTrace();
                }
            }
            mergedWorkbook.write(out);
        }
    }

    private static void copyRow(Row oldRow, Row newRow) {
        newRow.setHeight(oldRow.getHeight());
        for (int i = oldRow.getFirstCellNum(); i <= oldRow.getLastCellNum(); i++) {
            Cell oldCell = oldRow.getCell(i);
            if (null != oldCell) {
                copyCell(oldCell, newRow.createCell(i));
            }
        }
    }

    private static void copyCell(Cell oldCell, Cell newCell) {
        switch (oldCell.getCellTypeEnum()) {
            case FORMULA:
                newCell.setCellFormula(oldCell.getCellFormula());
                break;
            case NUMERIC:
                if (org.apache.poi.ss.usermodel.DateUtil.isCellDateFormatted(oldCell)) {
                    newCell.setCellValue(cn.hutool.core.date.DateUtil.formatDate(oldCell.getDateCellValue()));
                } else {
                    newCell.setCellValue(oldCell.getNumericCellValue());
                }
                break;
            case BLANK:
                newCell.setCellValue(oldCell.getStringCellValue());
                break;
            case BOOLEAN:
                newCell.setCellValue(oldCell.getBooleanCellValue());
                break;
            case STRING:
                newCell.setCellValue(oldCell.getStringCellValue());
                break;
            default:
                break;
        }
    }


    public void ExcelToPDF(String finalPath,String sourcePath){
        com.spire.xls.Workbook wb = new com.spire.xls.Workbook();
        wb.loadFromFile("D:\\resignreport\\A-180408-0209-01-source-20200507094815.xlsx");
        wb.saveToFile("D:\\resignreport\\mergeExcel\\ToPDF.pdf",FileFormat.PDF);
    }


    public static boolean getLicense() {
        boolean result = false;
        try {
            InputStream is = LimsFlagController.class.getClass().getResourceAsStream("license.xml");
                    //Test.class.getClassLoader().getResourceAsStream("license.xml"); //  license.xml应放在..\WebRoot\WEB-INF\classes路径下
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public  void excel2pdf(String Address,String target) {

        if (!getLicense()) {          // 验证License 若不验证则转化出的pdf文档会有水印产生
            return;
        }
        try {
            //File pdfFile = new File("D:\\resignreport\\mergeExcel\\PDF.pdf");// 输出路径
            File pdfFile = new File(target);
            com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(Address);
                    //new Workbook(Address);// 原始excel路径
            FileOutputStream fileOS = new FileOutputStream(pdfFile);
            wb.save(fileOS, SaveFormat.PDF);
            fileOS.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    合并pdf
     */

    public File mulFile2One(List<File> files,String targetPath) throws IOException{
        // pdf合并工具类
        PDFMergerUtility mergePdf = new PDFMergerUtility();
        for (File f : files) {
            if(f.exists() && f.isFile()){
                // 循环添加要合并的pdf
                mergePdf.addSource(f);
            }
        }
        // 设置合并生成pdf文件名称
        mergePdf.setDestinationFileName(targetPath);
        // 合并pdf
        mergePdf.mergeDocuments(MemoryUsageSetting.setupMainMemoryOnly());
        return new File(targetPath);
    }



    public void CompressPdf(String sourcePdf,String targetPdf){

        //加载需要压缩的PDF文档

        //  用spirpdf压缩
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile(sourcePdf);
        //禁用incremental update
        pdf.getFileInfo().setIncrementalUpdate(false);
        //遍历文档所有页面
        for (int i = 0; i < pdf.getPages().getCount(); i++) {
            PdfPageBase page = pdf.getPages().get(i);
            //获取页面中的图片
            PdfImageInfo[] images = page.getImagesInfo();
            if (images != null && images.length > 0)
                //遍历所有图片
                for (int j = 0; j < images.length; j++) {
                    PdfImageInfo image = images[j];
                    PdfBitmap bp = new PdfBitmap(image.getImage());
                    //降低图片的质量
                    bp.setQuality(20);
                    //用压缩后的图片替换原文档中的图片
                    page.replaceImage(j, bp);
                }
        }
        //保存文档
        pdf.saveToFile(targetPdf, com.spire.pdf.FileFormat.PDF);
        pdf.close();


    }


    /**
     * 去除压缩后生成的水印
     */

    public void clearSpireCompressLogoFlag(String sourcePdf,String targetPdf){
        //创建一个文档对象
        //PDDocument doc =null;
        try{
            //遮掉由于压缩生成的水印
            PdfReader reader = new PdfReader(sourcePdf);
            PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(targetPdf));
            //PdfContentByte canvas = stamper.getUnderContent(1);  //不可遮挡文字
            PdfContentByte canvas = stamper.getOverContent(1);  //可以遮挡文字
            canvas.saveState();
            //canvas.setColorFill(BaseColor.YELLOW);  //黄色遮挡层
            canvas.setColorFill(BaseColor.WHITE);  //白色遮挡层
            canvas.rectangle(0, 820, 400, 25);
            canvas.fill();
            canvas.restoreState();

            //获取宽高
            Rectangle pageSize = reader.getPageSize(1);
            float height = pageSize.getHeight();
            float width = pageSize.getWidth();
            logger.info("======={}========={}======",height,width);

            //加水印，（页码）
            int total = reader.getNumberOfPages() + 1;
            PdfContentByte content;
            PdfContentByte contentPage;
            PdfContentByte contentHF;
            PdfContentByte contentLogo;
            //设置字体
            BaseFont font = BaseFont.createFont();

            BaseFont fontPage = BaseFont.createFont();


            //签单
            PdfGState gs1 = new PdfGState();
            gs1.setFillOpacity(0.8f);
            Image image = Image.getInstance(IOUtils.toByteArray(new FileInputStream("D:\\resignreport\\signtools\\hf.png")));
            image.setAbsolutePosition(265,160);
            image.scalePercent(13,13);

            PdfGState gs2 = new PdfGState();
            gs2.setFillOpacity(0.8f);
            Image logoimage = Image.getInstance(IOUtils.toByteArray(new FileInputStream("D:\\resignreport\\signtools\\logo.png")));
            logoimage.setAbsolutePosition(425,750);
            logoimage.scalePercent(100,100);

            for(int i=1 ; i < total ; i++){
                content = stamper.getUnderContent(i);
                content.beginText();
                content.setColorFill(BaseColor.GRAY);
                //字体和字号
                content.setFontAndSize(font,38);
                //设置起始位置
                content.setTextMatrix(400,880);
                //写入水印
                content.showTextAligned(Element.ALIGN_LEFT,"HFLIMS",400,100,42);
                content.endText();

                if (i > 1){
                    contentPage = stamper.getUnderContent(i);
                    contentPage.beginText();
                    contentPage.setColorFill(BaseColor.BLACK);
                    contentPage.setFontAndSize(fontPage,14);
                    contentPage.setTextMatrix(300,900);
                    contentPage.showTextAligned(Element.ALIGN_CENTER,"Page  "+ String.valueOf(i-1) + "  of  " + String.valueOf(reader.getNumberOfPages() - 1) ,300,20,0);
                    contentPage.endText();

                    contentLogo = stamper.getUnderContent(i);
                    contentLogo.beginText();
                    contentLogo.addImage(logoimage);
                    contentLogo.endText();
                }

                if (i == 1){
                    contentHF = stamper.getUnderContent(i);
                    contentHF.beginText();
                    contentHF.addImage(image);
                    contentHF.endText();
                }
            }

            stamper.close();
            reader.close();


            //PDPage pdPage = doc.getPage(0);
            //PDPageTree pdPageTree = doc.getDocumentCatalog().getPages();
            //System.out.println("==================:" + pdPageTree.getCount());
            //org.apache.pdfbox.pdmodel.PDPage pdPage = pdPageTree.get(0);
            //InputStream contents = pdPage.getContents();
            //System.out.println("==================:" + contents);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
