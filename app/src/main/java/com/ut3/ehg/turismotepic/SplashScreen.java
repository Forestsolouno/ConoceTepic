package com.ut3.ehg.turismotepic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent Intent1 = new Intent().setClass(SplashScreen.this, SplashScreen2.class);
                startActivity(Intent1);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, SPLASH_SCREEN_DELAY);
    }
}