package com.example.david.angelsolve;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class CsSubMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_sub_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void python_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void java_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void cplusplus_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void javascript_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void swift_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void skip_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void c_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void csharp_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void r_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void htmlandcss_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }
    public void go_button (View view) {
        Intent intent = new Intent (this, Video.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menumain, menu);
        return true;
    }
}
