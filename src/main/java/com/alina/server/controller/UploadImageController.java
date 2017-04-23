package com.alina.server.controller;

import com.alina.server.entity.Photo;
import com.alina.server.service.PhotoService;
import com.alina.server.service.UserService;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by alina on 18.04.2017.
 */
@Controller
@ResponseBody
@RequestMapping("/upload")
public class UploadImageController {
    @Autowired
    private PhotoService service;
    @RequestMapping(value="/image",method = RequestMethod.POST)
    public @ResponseBody
    String uploadImage(@RequestParam("imageValue") String imageValue,@RequestParam("userLogin") String userLogin,@RequestParam("photo_name") String photoName )
    {

        try
        {
            //This will decode the String which is encoded by using Base64 class
            byte[] imageByte= Base64.decodeBase64(imageValue);

            String directory="C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\IMAGE\\"+photoName+".jpg";
            Photo ph=new Photo();
            ph.setFilename(photoName);
            ph.setOwnerName(userLogin);
            ph.setLikeCol(0);
            ph.setPath(directory);
            service.save(ph);
            FileOutputStream fos = new FileOutputStream(directory);
            fos.write(imageByte);
            fos.flush();
            fos.close();

           // new FileOutputStream(directory).write(imageByte);

            return "success ";


        }
        catch(Exception e)
        {
            return "error = "+e;
        }

    }
}
