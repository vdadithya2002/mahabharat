package com.example.mahabharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class day2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_day2);
    }
    public void war(View view){
        Intent i = new Intent(this, war.class);
        startActivity(i);
    }
    public void day3(View view){
        Intent i = new Intent(this, day3.class);
        startActivity(i);
    }
}