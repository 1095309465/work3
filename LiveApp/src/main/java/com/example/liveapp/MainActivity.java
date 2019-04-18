package com.example.liveapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    private String path=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        path="rtmp://rrbalancer.broadcast.tneg.de:1935/pw/ruk/ruk";
        path="rtsp://wowzaec2demo.streamlock.net/vod/mp4:BigBuckBunny_115k.mov";
        mVideoView=findViewById(R.id.vitamio_videoView);
        mVideoView.setVideoPath(path);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setPlaybackSpeed(1.0f);
            }
        });
    }
}
