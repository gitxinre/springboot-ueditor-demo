package com.example.service.impl;

import com.example.bean.Img;
import com.example.dao.ImgRepository;
import com.example.service.ImgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImgServiceImpl implements ImgService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ImgServiceImpl.class);

    @Autowired
    private ImgRepository imgRepository;
    @Override
    public void saveImg(Img img) {

        Img save = imgRepository.save(img);
        System.out.println("save.getId() = " + save.getId());
        System.out.println("save.getName() = " + save.getName());
        System.out.println("save.getCreateTime() = " + save.getCreateTime());
//        System.out.println("save.getBytes() = " + save.getBytes().toString());
        System.out.println("save = " + save);
    }

    @Override
    public Img getImgById(String id) {
        Img one = imgRepository.findOne(id);
        System.out.println("one = " + one);
        return one;
    }
}
