package com.example.vaccinationapp;

import androidx.appcompat.app.AppCompatActivity;
import covid19_package.CovidMain;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashCovid_19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_covid_19);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                    startActivity(new Intent(SplashCovid_19.this, CovidMain.class));
                SplashCovid_19.this.finish();
            }
        },2900);
    }

}