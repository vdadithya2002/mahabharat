package com.example.mahabharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class war extends AppCompatActivity {

    Button buttonDay1,
            buttonDay2,
            buttonDay3,
            buttonDay4,
            buttonDay5,
            buttonDay6,
            buttonDay7,
            buttonDay8,
            buttonDay9,
            buttonDay10,
            buttonDay11,
            buttonDay12,
            buttonDay13,
            buttonDay14,
            buttonDay15,
            buttonDay16,
            buttonDay17,
            buttonDay18,
            buttonMethodA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_war);



    }

    public void day1(View view){
        Intent i = new Intent(this, day1.class);
        startActivity(i);
    }
    public void day2(View view){
        Intent i = new Intent(this, day2.class);
        startActivity(i);
    }
    public void day3(View view){
        Intent i = new Intent(this, day3.class);
        startActivity(i);

    }
    public void day4(View view) {
        Intent i = new Intent(this, day4.class);
        startActivity(i);
    }
    public void day5(View view) {
        Intent i = new Intent(this, day5.class);
        startActivity(i);
    }
    public void day6(View view) {
        Intent i = new Intent(this, day6.class);
        startActivity(i);
    }
    public void day7(View view) {
        Intent i = new Intent(this, day7.class);
        startActivity(i);
    }
    public void day8(View view) {
        Intent i = new Intent(this, day8.class);
        startActivity(i);
    }
    public void day9(View view) {
        Intent i = new Intent(this, day9.class);
        startActivity(i);
    }
    public void day10(View view) {
        Intent i = new Intent(this, day10.class);
        startActivity(i);
    }
    public void day11(View view) {
        Intent i = new Intent(this, day11.class);
        startActivity(i);
    }
    public void day12(View view) {
        Intent i = new Intent(this, day12.class);
        startActivity(i);
    }
    public void day13(View view) {
        Intent i = new Intent(this, day13.class);
        startActivity(i);
    }
    public void day14(View view) {
        Intent i = new Intent(this, day14.class);
        startActivity(i);
    }
    public void day15(View view) {
        Intent i = new Intent(this, day15.class);
        startActivity(i);
    }
    public void day16(View view) {
        Intent i = new Intent(this, day16.class);
        startActivity(i);
    }
    public void day17(View view) {
        Intent i = new Intent(this, day17.class);
        startActivity(i);
    }
    public void day18(View view) {
        Intent i = new Intent(this, day18.class);
        startActivity(i);
    }

    public void MethodA(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}