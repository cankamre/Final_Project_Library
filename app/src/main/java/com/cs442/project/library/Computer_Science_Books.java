package com.cs442.project.library;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Rahi on 11/6/2015.
 */
public class Computer_Science_Books extends AppCompatActivity {
    ImageView img;
    ImageView search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView book;
        ImageView home;
        ImageView search;
        ImageView maps;
        ImageView profile;
        ImageView notification;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            home=(ImageView)findViewById(R.id.homeImage);
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    homeScreen();
                }
            });
            search = (ImageView)findViewById(R.id.search);
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    searchScreen();

                }
            });
            maps = (ImageView)findViewById(R.id.imageView5);
            maps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mapsScreen();

                }
            });

            profile = (ImageView)findViewById(R.id.imageView6);
            profile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    profileScreen();

                }
            });

            notification = (ImageView)findViewById(R.id.imageView4);
            notification.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notificationScreen();

                }
            });
        }

    public void homeScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void searchScreen(){
        Intent intent = new Intent(this, search.class);
        startActivity(intent);
        finish();
    }

    public void mapsScreen(){
        Intent intent = new Intent(this, maps.class);
        startActivity(intent);
        finish();
    }

    public void profileScreen(){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
        finish();
    }

    public void notificationScreen(){
        Intent intent = new Intent(this, notification.class);
        startActivity(intent);
        finish();
    }
}
