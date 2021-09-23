package com.example.demo.adapter;

import com.example.demo.constant.MediaType;
import com.example.demo.service.AdvancedMediaPlayer;
import com.example.demo.service.MediaPlayer;
import com.example.demo.service.impl.Mp4Player;
import com.example.demo.service.impl.VlcPlayer;

/**
 * @author chenchuancheng
 * @since 2021/9/22 15:06
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer player;

    public MediaAdapter(MediaType mediaType) {
        if (mediaType == MediaType.VLC) {
            player = new VlcPlayer();
        }
        if (mediaType == MediaType.MP4) {
            player = new Mp4Player();
        }
    }


    @Override
    public void play(MediaType mediaType, String filename) {
        if (mediaType == MediaType.VLC) {
            player.playVlc(filename);
        }
        if (mediaType == MediaType.MP4) {
            player.playMp4(filename);
        }
    }
}
