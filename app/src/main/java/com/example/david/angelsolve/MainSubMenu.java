package com.example.david.angelsolve;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainSubMenu extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // Handle page transitions
    public void cs_button (View view) {
        Intent intent = new Intent (this, CsSubMenu.class);
        startActivity(intent);
    }
    public void math_button (View view) {
        Intent intent = new Intent (this, MathSubMenu.class);
        startActivity(intent);
    }
    public void physics_button(View view) {
        Intent intent = new Intent (this, PhysicsSubMenu.class);
        startActivity(intent);
    }
    public void chemistry_button(View view) {
        Intent intent = new Intent (this, ChemSubMenu.class);
        startActivity(intent);
    }
    public void biology_button (View view) {
        Intent intent = new Intent (this, BioSubMenu.class);
        startActivity(intent);
    }
    public void economics_button(View view) {
        Intent intent = new Intent (this, EconSubMenu.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return true;
    }
}
