package com.example.mahabharat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private boolean isPlaying = true;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up MediaPlayer
        mediaPlayer = MediaPlayer.create(this, R.raw.kalkiandroid);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

        ImageButton pausebutton = findViewById(R.id.pausebutton);
        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isPlaying) {
                    mediaPlayer.pause();
                    pausebutton.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.pause_icon));
                } else {
                    mediaPlayer.start();
                    pausebutton.setBackground(ContextCompat.getDrawable(MainActivity.this, R.drawable.play_icon));
                }
                isPlaying = !isPlaying;
            }
        });

        // Set up the Navigation Drawer
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initialize ActionBarDrawerToggle to handle drawer open and close actions
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    // Handle Home button click
                    drawerLayout.closeDrawers();
                    return true;
                } else if (id == R.id.nav_exit) {
                    // Handle Exit button click
                    finish(); // Exit the app
                    return true;
                }
                return false;
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public void Characters(View view) {
        Intent i = new Intent(this, characters.class);
        startActivity(i);
    }

    public void war(View view) {
        Intent i = new Intent(this, war.class);
        startActivity(i);
    }

    public void aboutus(View view) {
        Intent i = new Intent(this, aboutus.class);
        startActivity(i);
    }
}
