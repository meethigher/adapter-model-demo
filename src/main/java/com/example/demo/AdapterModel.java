package com.example.demo;

import com.example.demo.constant.MediaType;
import com.example.demo.service.impl.MediaPlayerImpl;

/**
 * @author chenchuancheng
 * @since 2021/9/22 15:39
 */
public class AdapterModel {
    public static void main(String[] args) {
        MediaPlayerImpl audioPlayer = new MediaPlayerImpl();

        audioPlayer.play(MediaType.MP3, "beyond the horizon.mp3");
        audioPlayer.play(MediaType.MP4, "alone.mp4");
        audioPlayer.play(MediaType.VLC, "far far away.vlc");
        audioPlayer.play(MediaType.OTHER, "mind me.avi");
    }
}
