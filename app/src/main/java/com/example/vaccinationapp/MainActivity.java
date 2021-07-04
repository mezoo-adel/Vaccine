package com.example.vaccinationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.vaccinationapp.kidsvaccine_package.RegisterKids;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);


    }
    public void openCovid(View view){
        startActivity(new Intent(MainActivity.this,SplashCovid_19.class));
    }
    public void openKids(View view){
        startActivity(new Intent(MainActivity.this, RegisterKids.class));
    }
}