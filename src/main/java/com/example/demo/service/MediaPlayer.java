package com.example.demo.service;

import com.example.demo.constant.MediaType;

/**
 * @author chenchuancheng
 * @since 2021/9/22 14:59
 */
public interface MediaPlayer {
    /**
     * 媒体play
     * @param mediaType
     * @param filename
     */
    void play(MediaType mediaType, String filename);
}
