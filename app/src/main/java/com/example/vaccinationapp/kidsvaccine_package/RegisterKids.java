package com.example.vaccinationapp.kidsvaccine_package;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.vaccinationapp.R;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterKids extends AppCompatActivity {
SharedPreferences preferences ;
SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_kids);

        preferences=getSharedPreferences("registerKidsPrefrence",MODE_PRIVATE);
        if (!preferences.getBoolean("alreadyCreated",false)){
            editor= preferences.edit();
            editor.putBoolean("alreadycreated",true);
            editor.commit();


        }else {

        }
    }
}