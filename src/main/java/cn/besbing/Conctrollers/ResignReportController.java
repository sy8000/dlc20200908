package cn.besbing.Conctrollers;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import static cn.besbing.Conctrollers.ImageProcessor.readInputStream;

@Controller
public class ResignReportController {

    Logger logger = LoggerFactory.getLogger(ImageProcessor.class);

    @RequestMapping(value = "/uploadReport")
    @ResponseBody
    //
    public synchronized Map<String, Object> uploadReports(MultipartFile file, HttpServletRequest request) {
        JSONObject jsonObject = new JSONObject();
        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> imagePath = new HashMap<String,Object>();
        try{
            logger.info("-------------------{}",file.getOriginalFilename());
            InputStream inputStream = file.getInputStream();
            byte[] data = readInputStream(inputStream);
            String name = "d:/resignReport/" + file.getOriginalFilename();
            String suffixName = name.substring(name.lastIndexOf("."));
            File reportFile = new File(name);
            if (reportFile.exists()){
                reportFile.delete();
            }
            //创建输出流
            FileOutputStream outStream = new FileOutputStream(reportFile);
            //写入数据
            outStream.write(data);
            //关闭输出流
            inputStream.close();
            outStream.flush();
            outStream.close();
            /*jsonObject.put("code",0);
            jsonObject.put("msg","success");
            jsonObject.put("data",reportFile);*/
            map.put("code",0);
            map.put("msg","success");
            map.put("data",reportFile);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("报告上传错误，错误：{}",e.getStackTrace());
        }
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
