package org.example.adapter;

import org.example.Player;

public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer();
        PlayerAdapter playerAdapter = new PlayerAdapter(videoPlayer);
        playerAdapter.play();
    }
}
