package com.dfd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class secactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secactivity);


        ImageButton button = findViewById(R.id.about);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, aboutpage.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button2 = findViewById(R.id.journaling);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, journal.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button3 = findViewById(R.id.meditation);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, meditation.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button4 = findViewById(R.id.herbals);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, herbals.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button9 = findViewById(R.id.literature);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, literature.class);
                startActivity(intent);
                finish();
            }
        });

        ImageButton button0 = findViewById(R.id.contacts);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(secactivity.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
