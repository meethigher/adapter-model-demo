package com.example.demo.service.impl;

import com.example.demo.adapter.MediaAdapter;
import com.example.demo.constant.MediaType;
import com.example.demo.service.MediaPlayer;

/**
 * @author chenchuancheng
 * @since 2021/9/22 15:21
 */
public class MediaPlayerImpl implements MediaPlayer {
    private MediaAdapter mediaAdapter;
    @Override
    public void play(MediaType mediaType, String filename) {
        if(mediaType==MediaType.MP3){
            System.out.println("playing mp3 file. filename="+filename);
        }else if(mediaType==MediaType.VLC||mediaType==MediaType.MP4){
            mediaAdapter=new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType,filename);
        }else {
            System.out.println("invalid media. "+mediaType+" format not supported!");
        }
    }
}
