package com.example.warhero;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.warhero.barishev.MainActivity5;
import com.example.warhero.hvatkov.MainActivity4;
import com.example.warhero.matrosov.MainActivity2;
import com.example.warhero.mitryagin.MainActivity3;

public class MainActivity extends AppCompatActivity {

   private ImageView imageMatrosov;
    private ImageView imageMitryagin;
    private ImageView imageHvatkov;
    private ImageView imageBarishev;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageMatrosov = findViewById(R.id.PhotoMotrosov);
        imageMitryagin = findViewById(R.id.PhotoMitryagin);
        imageHvatkov = findViewById(R.id.PhotoHvatkov);
        imageBarishev = findViewById(R.id.PhotoBarishev);

        /*музыка на фоне*/
        mediaPlayer = MediaPlayer.create(this, R.raw.svehvoina);
        mediaPlayer.start();


        /*создание анимации на картинки на начальном экране*/
        imageMatrosov.animate().alpha(1).setDuration(3000);
        imageHvatkov.animate().alpha(1).setDuration(3000);
        imageMitryagin.animate().alpha(1).setDuration(3000);
        imageBarishev.animate().alpha(1).setDuration(3000);


    }

    /*Переход на конкретного человека при клике на картинку*/
    public void matrosov(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void mitryagin(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void hvatkov(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void barishev(View view) {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }


    /*создание меню с настройками*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout, menu);
        return true;
    }


    /*пвключение или выключение музыки*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.item2:
                mediaPlayer.stop();
                break;
        }
        return true;
    }
}


