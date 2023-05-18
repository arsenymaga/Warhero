package com.example.warhero.hvatkov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.warhero.R;
import com.example.warhero.hvatkov.AwardsActivityHvat;
import com.example.warhero.hvatkov.BoiActivityHvat;
import com.example.warhero.hvatkov.FeatActivityHvat;

public class MainActivity4 extends AppCompatActivity {

    private  Button aboutButtonHvat;
    private  Button featButtonHvat;
    private  Button awardsButtonHvat;
    private TextView textNameHvat;
    private TextView textYearsHvat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        aboutButtonHvat = findViewById(R.id.buttonBioHvat);
        featButtonHvat = findViewById(R.id.buttonFeatHvat);
        awardsButtonHvat = findViewById(R.id.buttonAwardsHvat);
        textNameHvat = findViewById(R.id.textNameHvat);
        textYearsHvat = findViewById(R.id.textYearsHvat);

        /*анимация на появление кнопок*/
        aboutButtonHvat.animate().alpha(1).setDuration(2000);
        featButtonHvat.animate().alpha(1).setDuration(2000);
        awardsButtonHvat.animate().alpha(1).setDuration(2000);

        /*анимация на поворот текста*/
        textNameHvat.animate().rotationX(720).setDuration(2000);
        textYearsHvat.animate().rotationX(720).setDuration(2000);

    }

    /*Переход на какую либо позицию человека при клике на кнопку*/
    public void biographyHvat(View view) {
        Intent intent = new Intent(this, BoiActivityHvat.class);
        startActivity(intent);
    }

    public void featHvat(View view) {
        Intent intent = new Intent(this, FeatActivityHvat.class);
        startActivity(intent);
    }

    public void awardsHvat(View view) {
        Intent intent = new Intent(this, AwardsActivityHvat.class);
        startActivity(intent);
    }
}