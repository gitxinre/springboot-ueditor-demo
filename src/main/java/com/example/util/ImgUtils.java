package com.example.util;

import java.io.*;

public class ImgUtils {

    public static byte[] readImg(String url) {
        FileInputStream fileInputStream = null;
        int available = 0;
        try {
            fileInputStream = new FileInputStream(new File("D:\\1.png"));
            available = fileInputStream.available();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[available];
    }

    public static void readBin2Image(InputStream in, String fileName) {

        String targetPath = "D:/copy_image/"+fileName+".png";
        File file = new File(targetPath);
        String path = targetPath.substring(0, targetPath.lastIndexOf("/"));
        if (!file.exists()) {
            new File(path).mkdir();
        }
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = in.read(buf)) != -1) {
                fos.write(buf, 0, len);
            }
            fos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fos) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
