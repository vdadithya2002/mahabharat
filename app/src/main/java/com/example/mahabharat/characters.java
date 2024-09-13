package com.example.mahabharat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class characters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_characters);
    }
    public void pandavas(View view){
        Intent i = new Intent(this, pandavas.class);
        startActivity(i);
    }
    public void kauravas(View view){
        Intent i = new Intent(this, kauravas.class);
        startActivity(i);
    }
    public void minorcharacters(View view){
        Intent i = new Intent(this, minorcharacters.class);
        startActivity(i);

    }
    public void othercharacters (View view) {
        Intent i = new Intent(this, othercharacters.class);
        startActivity(i);
    }
    public void MethodA(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}