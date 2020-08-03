package cn.besbing.Conctrollers;

import cn.besbing.Service.Impl.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
public class DownloadController {

    @Autowired
    DownloadService downloadService;

    /*@RequestMapping(value = "/dl",method = RequestMethod.GET)
    public void  d(){
        downloadFile();
    }*/

    @RequestMapping(value = "/download",method = RequestMethod.GET)
    public  void  downloadFile(HttpServletRequest request,HttpServletResponse response) {
        /*ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = servletRequestAttributes.getResponse();*/
        try {
            String imageFile = request.getParameter("imageFile");
            downloadService.downloadFile(response,imageFile);
            /*File file = new File(imageFile);
            if (file.exists()){
                file.delete();
            }*/
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
