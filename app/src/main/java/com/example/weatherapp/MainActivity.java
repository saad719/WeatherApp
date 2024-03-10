package com.example.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;




import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logoImageView = findViewById(R.id.iconView);
        TextView nameApp = findViewById(R.id.textTitle);

        // Load the animation
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splashing);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.textanim);
        // Start the animation
        logoImageView.startAnimation(animation);
        nameApp.startAnimation(animation1);
        int delayMillis = 2000;

        // Create a Handler object
        Handler handler = new Handler();

        // Post a delayed action to start the next activity
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the next activity here
                Intent intent = new Intent(MainActivity.this, startp.class);
                startActivity(intent);
                finish(); // Optional: Finish current activity to prevent user from returning to it
            }
        }, delayMillis);
    }
}