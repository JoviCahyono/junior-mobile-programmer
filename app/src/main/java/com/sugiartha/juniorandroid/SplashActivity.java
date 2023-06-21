package com.sugiartha.juniorandroid;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logoImageView = findViewById(R.id.logo_id);

        // Fade-in animation for the logo
        ObjectAnimator logoAnimator = ObjectAnimator.ofFloat(logoImageView, "alpha", 0f, 1f);
        logoAnimator.setDuration(1000);
        logoAnimator.setInterpolator(new AccelerateInterpolator());
        logoAnimator.start();


        handler=new Handler();
        handler.postDelayed(() -> {
            Intent intent=new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        },3000);

    }
}