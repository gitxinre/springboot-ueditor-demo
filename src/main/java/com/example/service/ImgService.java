package com.example.service;

import com.example.bean.Img;

public interface ImgService {

    void saveImg(Img img);

    Img getImgById(String id);
}
