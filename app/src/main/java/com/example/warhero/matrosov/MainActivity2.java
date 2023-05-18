package com.example.warhero.matrosov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.warhero.R;

public class MainActivity2 extends AppCompatActivity {
    private Button aboutButton;
    private Button featButton;
    private Button awardsButton;
    private TextView textName;
    private TextView textYearsMat;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        aboutButton = findViewById(R.id.buttonBio);
        featButton = findViewById(R.id.button2);
        awardsButton = findViewById(R.id.buttonAwards);
        textName = findViewById(R.id.textNameHvat);
        textYearsMat = findViewById(R.id.textYearsHvat);



        /*анимация на появление кнопок*/
        aboutButton.animate().alpha(1).setDuration(2000);
        featButton.animate().alpha(1).setDuration(2000);
        awardsButton.animate().alpha(1).setDuration(2000);



        /*анимация на поворот текста*/
        textName.animate().rotationX(720).setDuration(2000);
        textYearsMat.animate().rotationX(720).setDuration(2000);
    }

    /*Переход на какую либо позицию человека при клике на кнопку*/
    public void biography(View view) {
        Intent intent = new Intent(this, BioActivity.class);
        startActivity(intent);
    }

    public void feat(View view) {
        Intent intent = new Intent(this, FeatActivity.class);
        startActivity(intent);
    }

    public void awards(View view) {
        Intent intent = new Intent(this, AwardsActivity.class);
        startActivity(intent);
    }
}