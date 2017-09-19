package com.example.albert.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        Button btnsignup =(Button) findViewById(R.id.createaccount);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homepageinent = new Intent(signup.this,home.class);
                startActivity(homepageinent);

            }
        });
        EditText txtFirstname = (EditText) findViewById(R.id.firstname);
        EditText txtLastname = (EditText) findViewById(R.id.Lastname);
        EditText txtEmail = (EditText) findViewById(R.id.Email);
        EditText txtPhonenumber = (EditText) findViewById(R.id.phonenumber);
        EditText txtpassword = (EditText) findViewById(R.id.Password);


    }

}
