package cn.besbing.Service.Impl;


import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Service
public class DownloadServiceImpl {


    public void downLoad(HttpServletResponse response,String filename) throws UnsupportedEncodingException {
        String filePath = "D:/resignreport/finalresign" ;
        //String filePath = "/finalReport" ;
        File file = new File(filePath + "/" + filename);
        //File file = new File(filename);
        if(file.exists()){
            response.setContentType("application/octet-stream");
            response.setHeader("content-type", "application/octet-stream");
            response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(filename,"utf8"));
            byte[] buffer = new byte[1024];
            //输出流
            OutputStream os = null;
            try(FileInputStream fis= new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);) {
                os = response.getOutputStream();
                int i = bis.read(buffer);
                while(i != -1){
                    os.write(buffer);
                    i = bis.read(buffer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public String downloadFile(HttpServletResponse response, String fillName) throws Exception {
        if (fillName != null && fillName.trim() != ""){
            File file = new File(fillName);
            if (file.exists()){
                response.setContentType("application/force-download");
                response.addHeader("Content-Disposition","attachment;fileName=" + fillName);

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
                            os.flush();
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
        return "download success";
    }
}
