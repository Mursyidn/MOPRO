package com.example.mursyid.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login,regis,btnfb,btngoogle,btntwitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        regis = (Button) findViewById(R.id.regis);
        btnfb = (Button) findViewById(R.id.btnfb);
        btntwitter = (Button) findViewById(R.id.btntwitter);
        btngoogle = (Button) findViewById(R.id.btngoogle);


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent intent2 = new Intent(MainActivity.this, berhasillogin.class);
                startActivity(intent2);
            }
        });

        regis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Intent i = new Intent(MainActivity.this, registerr.class);
                startActivity(i);
            }
        });

        btnfb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Uri fb = Uri.parse("http://www.facebook.com");
                Intent intent3 = new Intent(Intent.ACTION_VIEW, fb);
                startActivity(intent3);
            }
        });

        btngoogle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Uri gmail = Uri.parse("http://www.gmail.com");
                Intent intent4 = new Intent(Intent.ACTION_VIEW, gmail);
                startActivity(intent4);
            }
        });


        btntwitter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg) {
                Uri twitter = Uri.parse("http://www.twitter.com");
                Intent intent5 = new Intent(Intent.ACTION_VIEW, twitter);
                startActivity(intent5);
            }
        });


    }
}




