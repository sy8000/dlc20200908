package cn.besbing;


import cn.besbing.Entities.CProjTask;
//import cn.besbing.Entities.DoubleBalls;
import cn.besbing.Service.Impl.DoubleBallsServiceImpl;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.io.FileInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DloadercloudApplication.class)
public class InsertBalls {

    Logger logger = LoggerFactory.getLogger(InsertBalls.class);

    @Autowired
    DoubleBallsServiceImpl doubleBallsService;

    @Test
    public void insertDoubleBallsFromExcel(){
        String balls[][] = null;
        /*try {
            DecimalFormat decimalFormat = new DecimalFormat("###################.###########");
            HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream("c:/double.xls"));
            int numberOfSheets = workbook.getNumberOfSheets();
            // 遍历表。
            for (int i = 0; i < numberOfSheets; i++) {
                Sheet sheet = workbook.getSheetAt(i);

                // 行数。
                int rowNumbers = sheet.getLastRowNum() + 1;

                // Excel第一行。
                Row temp = sheet.getRow(0);
                if (temp == null) {
                    continue;
                }

                int cells = temp.getPhysicalNumberOfCells();

                balls = new String[rowNumbers - 1][8];

                int colNum = 0;

                // 读数据。
                for (int row = 1; row < rowNumbers; row++) {
                    Row r = sheet.getRow(row);
                    colNum = 0;
                    for (int col = 0; col < cells; col++) {
                        if (r.getCell(col) != null && !"".equals(r.getCell(col).toString())){
                            //System.out.print(subZeroAndDot(r.getCell(col).toString())+" ");
                            switch (colNum){
                                case 0:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 1:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 2:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 3:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 4:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 5:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 6:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                case 7:
                                    balls[row - 1][colNum] = subZeroAndDot(r.getCell(col).toString());
                                    colNum++;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }

                    // 换行。
                    System.out.println();
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }*/

        int countInsert = 0;
        SimpleDateFormat dateFormate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*DoubleBalls doubleBalls = new DoubleBalls();
        //开始写入数据库
        for (int i=0;i<balls.length;i++){
            doubleBalls.setOpenDate("20" + balls[i][0]);
            doubleBalls.setRedball1(balls[i][1]);
            doubleBalls.setRedball2(balls[i][2]);
            doubleBalls.setRedball3(balls[i][3]);
            doubleBalls.setRedball4(balls[i][4]);
            doubleBalls.setRedball5(balls[i][5]);
            doubleBalls.setRedball6(balls[i][6]);
            doubleBalls.setBlueball(balls[i][7]);

            doubleBalls.setTs(null);
            doubleBalls.setVdef1("");
            doubleBalls.setVdef2("");
            doubleBalls.setVdef3("");
            doubleBalls.setVdef4("");
            doubleBalls.setVdef5("");*/

            try{
               // countInsert += doubleBallsService.insertRecord(doubleBalls);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        //logger.info("===============共计插入{}条记录==================",countInsert);

    //}

    public static String subZeroAndDot(String s){
        if(s.indexOf(".") > 0){
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }

}
