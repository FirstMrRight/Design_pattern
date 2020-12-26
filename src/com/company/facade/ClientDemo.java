package com.company.facade;

import java.io.File;

/**
 * @author Liutx
 * @date 2020/12/26 22:59
 * @Description
 */
public class ClientDemo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("video.ogg", "mp4");
    }
}
