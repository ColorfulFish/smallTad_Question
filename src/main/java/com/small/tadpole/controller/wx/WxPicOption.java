package com.small.tadpole.controller.wx;
/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.cn
 * @Description
 * @Date 9:03 2019/9/27
 **/

import com.small.tadpole.domain.pic.PicInfo;
import com.small.tadpole.exception.WxRuntimeException;
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

    @ApiOperation(value="上传文件", httpMethod = "POST")
    @PostMapping("/upload")
    public PicInfo upload(@ApiParam(value = "文件", required = true)
                          @RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            throw new WxRuntimeException(200);
        }
        String fileName = file.getOriginalFilename();
        String fileType = file.getOriginalFilename().split("\\.")[1];
        String fileNameOld = uploadPicPath + File.separator + fileName;
        String fileNameNew = uploadPicPath + File.separator + "wx" + System.currentTimeMillis() + "." + fileType;
        int size = (int) file.getSize();
        File dest = new File(fileNameOld);
        File destNew = new File(fileNameNew);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            dest.renameTo(destNew);
            return new PicInfo(destNew.getName(), size);
        } catch (IllegalStateException e) {
            throw new WxRuntimeException(201);
        } catch (IOException e) {
            throw new WxRuntimeException(202);
        }
    }
}
