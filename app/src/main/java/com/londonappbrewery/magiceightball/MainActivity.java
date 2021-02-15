package com.londonappbrewery.magiceightball;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button =findViewById(R.id.askButton);

        final ImageView ball = findViewById(R.id.ballImage);


        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,

        };


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);

                   ball.setImageResource(ballArray[number]);
            }
        });

    }

}
