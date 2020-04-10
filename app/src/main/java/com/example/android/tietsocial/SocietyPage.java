package com.example.android.tietsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SocietyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_society_page);
    }
    public void openInfo (View view){
        // Do something in response to button click
        Intent i = new Intent(this, MarkedPosts.class);
        startActivity(i);
    }
}
