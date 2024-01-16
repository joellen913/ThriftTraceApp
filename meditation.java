package com.dfd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class meditation extends AppCompatActivity {

    private VideoView videoView;
    private VideoView videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);

        videoView = findViewById(R.id.videoView);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.breathe;

        videoView.setVideoPath(videoPath);
        videoView.start();

        //second video view
        videoView2 = findViewById(R.id.videoView2);

        String videoPath2 = "android.resource://" + getPackageName() + "/" + R.raw.yoga;

        videoView2.setVideoPath(videoPath2);
        videoView2.start();

        ImageButton button = findViewById(R.id.newarrow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(meditation.this, secactivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}