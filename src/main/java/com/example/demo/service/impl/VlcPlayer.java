package com.example.demo.service.impl;

import com.example.demo.service.AdvancedMediaPlayer;

/**
 * @author chenchuancheng
 * @since 2021/9/22 15:02
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename) {
        System.out.println("play Vlc file. filename="+filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
