package com.example.vaccinationapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vaccinationapp.pager_package.MyPagerAdapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class StartPages extends AppCompatActivity {




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_covid19);

        SharedPreferences   preferences = getSharedPreferences("startPagePrefrences", MODE_PRIVATE);
        if (!preferences.getBoolean("alreadyCreated",false)){
            SharedPreferences.Editor   editor = preferences.edit();
            editor.putBoolean("alreadyCreated", true);
            editor.commit();

            ViewPager pager = findViewById(R.id.view_pager);
            pager.setAdapter(new MyPagerAdapter(this));
            Toast.makeText(this, "إسحب الشاشة من اليمين إلى اليسار", Toast.LENGTH_LONG).show();
        }
        else{
            openMAin(null);
        }
    }

    public void openMAin(View view) {
        startActivity(new Intent(getBaseContext(), MainActivity.class));
        StartPages.this.finish();
    }
}