package com.example.ex041;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button btn;
    Random rand;
    int[] img = new int[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();
        btn = (Button) findViewById(R.id.main_button);

        img[0] = R.drawable.leaver_1;
        img[1] = R.drawable.leaver_2;
        img[2] = R.drawable.leaver_3;

        iv = findViewById(R.id.iv);
    }

    public void buttonClick(View view) {
        int number = rand.nextInt(3)+1;
        btn.setText(number + "");
        iv.setImageResource(img[number-1]);
    }
}

