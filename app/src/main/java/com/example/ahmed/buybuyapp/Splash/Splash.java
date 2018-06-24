package com.example.ahmed.buybuyapp.Splash;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmed.buybuyapp.Activities.Login;
import com.example.ahmed.buybuyapp.R;


public class Splash extends AppCompatActivity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @RequiresApi(api = Build.VERSION_CODES.ECLAIR)
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);
                overridePendingTransition(R.anim.slide_up, 0);
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


}
