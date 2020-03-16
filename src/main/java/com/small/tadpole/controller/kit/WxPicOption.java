package com.small.tadpole.controller.kit;
/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.cn
 * @Description
 * @Date 9:03 2019/9/27
 **/

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/wx/pic")
@Api(value="微信端调用文件上传接口")
public class WxPicOption {

    @Value("${pic.upload.path}")
    private String uploadPicPath;

    @ApiOperation(value="上传文件",notes="开始页数,页数大小", httpMethod = "GET")
    @GetMapping("/list")
    public String upload(@ApiParam(value = "文件",required = true)
                             @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        File dest = new File(uploadPicPath);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            e.printStackTrace();
            return "false";
        }
    }
}
