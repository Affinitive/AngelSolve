package com.example.david.angelsolve;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MathSubMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_sub_menu);
    }
    public void algebra_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
    public void geometry_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
    public void algebraii_button_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
    public void precalculus_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
    public void calculus_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
    public void skip_button (View view) {
        Intent intent = new Intent (this, VideoCam.class);
        startActivity(intent);
    }
}
