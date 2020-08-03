package cn.besbing.Conctrollers;


import cn.besbing.Service.Impl.DownloadServiceImpl;
import com.alibaba.fastjson.JSONObject;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class ImageProcessor {

    Logger logger = LoggerFactory.getLogger(ImageProcessor.class);

    @Autowired
    DownloadServiceImpl downloadService;

    @RequestMapping(value = "/processImage",method = RequestMethod.GET)
    public String uploadImageUrl(){
        return "pages/processImages";
    }


    @RequestMapping(value = "/downloadImage",method = RequestMethod.POST)
    public  void  downloadFile(String fileName) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();
        try {
            if (fileName != null && fileName.trim() != ""){
                File file = new File(fileName);
                if (file.exists()){
                    response.setContentType("application/force-download");
                    response.addHeader("Content-Disposition","attachment;fileName=" + fileName);

                    byte[] buffer = new byte[1024];
                    FileInputStream fis = null;
                    BufferedInputStream bis = null;
                    OutputStream os = null;

                    try {
                        fis = new FileInputStream(file);
                        bis = new BufferedInputStream(fis);
                        os = response.getOutputStream();
                        int i = bis.read(buffer);
                        while (i != -1){
                            os.write(buffer,0,i);
                            i = bis.read(buffer);
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }finally {
                        if (bis != null){
                            try {
                                bis.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                        if (fis != null){
                            try {
                                fis.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                        if (os != null){
                            try {
                                os.close();
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }

                    }
                }else {
                    throw new Exception("File is not exist");
                }
            }else {
                throw new Exception("File Name is Empty");
            }
            //String s = downloadService.downloadFile(response, fileName);
            File file = new File(fileName);
            if (file.exists()){
                file.delete();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping(value = "/processUploadImages")
    @ResponseBody
    public Map<String, Object> batchImagesUpload(MultipartFile file, HttpServletRequest request) throws Exception {
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> imagePath = new HashMap<String,Object>();
        InputStream inputStream = file.getInputStream();
        byte[] data = readInputStream(inputStream);
        //new一个文件对象用来保存图片，默认保存当前工程根目录
        //File imageFile = new File("image.jpg");
        String name = file.getOriginalFilename();
        String suffixName = name.substring(name.lastIndexOf("."));
        File imageFile = new File(name);
        if (imageFile.exists()){
            imageFile.delete();
        }
        //创建输出流
        FileOutputStream outStream = new FileOutputStream(imageFile);
        //写入数据
        outStream.write(data);
        //关闭输出流
        inputStream.close();
        outStream.flush();
        outStream.close();

        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String fileName = formatter.format(date) + suffixName ;
        Thumbnails.of(imageFile).width(1420).height(1065).toFile(fileName);
        //imageFile.delete();
        imagePath.put("data",fileName);
        map.put("code",0);
        map.put("msg","success");
        map.put("data",imagePath);

        return map;
    }


    public static byte[] readInputStream(InputStream inStream) throws Exception {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来
        while ((len = inStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度
            outStream.write(buffer, 0, len);
        }
        //关闭输入流
        inStream.close();
        byte[] returnVar = outStream.toByteArray();
        outStream.flush();
        outStream.close();
        //把outStream里的数据写入内存
        return returnVar;
    }




}
