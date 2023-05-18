package com.example.warhero.barishev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.warhero.R;

public class MainActivity5 extends AppCompatActivity {


    private Button bioButtonBar;
    private Button featButtonBar;
    private Button awardsButtonBar;
    private TextView textNameBar;
    private TextView textYearsBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        bioButtonBar = findViewById(R.id.buttonBioBar);
        featButtonBar = findViewById(R.id.buttonFeatBar);
        awardsButtonBar = findViewById(R.id.buttonAwardsBar);
        textNameBar = findViewById(R.id.textNameBar);
        textYearsBar = findViewById(R.id.textYearsBar);


        /*анимация на появление кнопок*/
        bioButtonBar.animate().alpha(1).setDuration(2000);
        featButtonBar.animate().alpha(1).setDuration(2000);
        awardsButtonBar.animate().alpha(1).setDuration(2000);

        /*анимация на поворот текста*/
        textNameBar.animate().rotationX(720).setDuration(2000);
        textYearsBar.animate().rotationX(720).setDuration(2000);
    }


    /*Переход на какую либо позицию человека при клике на кнопку*/
    public void biographyBar(View view) {
        Intent intent = new Intent(this, BioActivityBar.class);
        startActivity(intent);
    }

    public void featBar(View view) {
        Intent intent = new Intent(this, FeatActivityBar.class);
        startActivity(intent);
    }

    public void awardsBar(View view) {
        Intent intent = new Intent(this, AwardsActivityBar.class);
        startActivity(intent);
    }
}