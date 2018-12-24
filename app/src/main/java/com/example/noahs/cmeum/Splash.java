package com.example.noahs.cmeum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Noahs on 3/29/2016.
 */
public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);
        Thread cmeumThread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3500);
                    Intent startMain = new Intent(getApplicationContext(), cmeum_start.class);
                    startActivity(startMain);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        cmeumThread.start();

    }
}
