package com.example.noahs.cmeum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.AppCompatImageButton;
import android.widget.ImageButton;

/**
 * Created by hp on 3/29/2016.
 */
public class cmeum_start extends AppCompatActivity {
    private static AppCompatImageButton Jokes;
    private static AppCompatImageButton Memes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmeumstart);
        onClickButtonListener();
    }



         public void onClickButtonListener() {
          Memes = (AppCompatImageButton) findViewById(R.id.imageButton2);
          Memes.setOnClickListener(
                  new View.OnClickListener() {
                      @Override
                      public void onClick(View v) {
                          Intent intentMain2Activity = new Intent(cmeum_start.this, Main2Activity.class);
                          startActivity(intentMain2Activity);
                      }
                  }
          );
             {





            Jokes = (AppCompatImageButton) findViewById(R.id.imageButton);
            Jokes.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intentMainActivity = new Intent(cmeum_start.this, MainActivity.class);
                            startActivity(intentMainActivity);
                        }
                    }
            );

        }
    }}

