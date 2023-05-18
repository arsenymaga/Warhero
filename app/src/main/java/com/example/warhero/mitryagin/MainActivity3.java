package com.example.warhero.mitryagin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.warhero.R;
import com.example.warhero.mitryagin.AwardsActivityMit;
import com.example.warhero.mitryagin.BioActivityMit;
import com.example.warhero.mitryagin.FeatActivityMit;

public class MainActivity3 extends AppCompatActivity {
    Button aboutButtonMit;
    Button featButtonMit;
    Button awardsButtonMit;
    TextView textNameMit;
    TextView textYearsMit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        aboutButtonMit = findViewById(R.id.buttonBioMit);
        featButtonMit = findViewById(R.id.buttonFeatMit);
        awardsButtonMit = findViewById(R.id.buttonAwardsMit);
        textNameMit = findViewById(R.id.textNameHvat);
        textYearsMit = findViewById(R.id.textYearsHvat);

        /*анимация на появление кнопок*/
        aboutButtonMit.animate().alpha(1).setDuration(2000);
        featButtonMit.animate().alpha(1).setDuration(2000);
        awardsButtonMit.animate().alpha(1).setDuration(2000);


        /*анимация на поворот текста*/
        textNameMit.animate().rotationX(720).setDuration(2000);
        textYearsMit.animate().rotationX(720).setDuration(2000);
    }

    /*Переход на какую либо позицию человека при клике на кнопку*/
    public void biographyMit(View view) {
        Intent intent = new Intent(this, BioActivityMit.class);
        startActivity(intent);
    }

    public void featMit(View view) {
        Intent intent = new Intent(this, FeatActivityMit.class);
        startActivity(intent);
    }

    public void awardsMit(View view) {
        Intent intent = new Intent(this, AwardsActivityMit.class);
        startActivity(intent);
    }
}




