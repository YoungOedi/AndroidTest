package de.dortmund.fh.jung.masterapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.dortmund.fh.jung.masterapp.R;
import de.dortmund.fh.jung.masterapp.homeScreen.HomeScreenActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Intent intent = new Intent(this, HomeScreenActivity.class);
        startActivity(intent);
        finish();
    }
}
