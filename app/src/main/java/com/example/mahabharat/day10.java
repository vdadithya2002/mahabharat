package com.example.mahabharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class day10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_day10);
    }
    public void war(View view){
        Intent i = new Intent(this, war.class);
        startActivity(i);
    }
    public void day11(View view){
        Intent i = new Intent(this, day11.class);
        startActivity(i);
    }
}