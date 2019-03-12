package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.UpdwService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/updw1")
public class UpdwController {
    @Autowired
    private UpdwService updwService;

    @RequestMapping("/upload")
    public void upload(Album album,MultipartFile file, HttpSession session) throws IOException {
        album.setAlbumId(UUID.randomUUID().toString().replaceAll("-",""));
        String filename = file.getOriginalFilename();
        album.setCoverPath(filename);
        updwService.upload(album);
        String realPath = session.getServletContext().getRealPath("upload");
        File file1 = new File(realPath + "/" + filename);
        file.transferTo(file1);
    }
   @RequestMapping("/down")
    public void down(String src,HttpSession session, HttpServletResponse response) throws Exception {
        String realPath = session.getServletContext().getRealPath("/upload");
        File file = new File(realPath+"/"+src);
        byte[] bs = FileUtils.readFileToByteArray(file);
        response.setHeader("content-disposition", "attachment;filename="+ URLEncoder.encode(new Date().getTime()+""+src, "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        FileUtils.copyFile(file, out);
        out.write(bs);
        if(out!=null){out.flush();}
        if(out!=null){out.close();}
    }
}
