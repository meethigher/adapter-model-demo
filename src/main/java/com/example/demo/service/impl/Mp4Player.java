package com.example.demo.service.impl;

import com.example.demo.service.AdvancedMediaPlayer;
/**
 * @author chenchuancheng
 * @since 2021/9/22 15:06
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("play mp4 file. filename=" + filename);
    }
}
