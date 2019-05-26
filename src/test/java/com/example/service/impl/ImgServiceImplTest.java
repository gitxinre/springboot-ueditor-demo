package com.example.service.impl;

import com.example.UeditorTestApplication;
import com.example.bean.Img;
import com.example.util.ImgUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.ByteArrayInputStream;
import java.sql.Date;
import java.util.UUID;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UeditorTestApplication.class)
public class ImgServiceImplTest {


    @Autowired
    private ImgServiceImpl imgService;


    @Test
    public void testSaveImg() {

        Img img = new Img();
        String replace = UUID.randomUUID().toString().replace("-", "");
        img.setId(replace);
        System.out.println("replace = " + replace);
        img.setCreateTime(new Date(System.currentTimeMillis()));
        img.setName("name");
        img.setBytes(ImgUtils.readImg("a"));
        System.out.println("img = " + img);
        imgService.saveImg(img);

        System.out.println("img = " + img);
    }


    @Test
    public void testFindByIdImgInfo() {
        Img imgById = imgService.getImgById("9978be5cc4bf436da031bcfe698d458a");

        byte[] bytes = imgById.getBytes();
        ImgUtils.readBin2Image(new ByteArrayInputStream(bytes), "11");

        System.out.println("imgById = " + imgById);
    }




}