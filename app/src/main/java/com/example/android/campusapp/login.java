package com.example.android.campusapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.app.Activity;

import static com.example.android.campusapp.R.layout.activity_login;

public class login extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*login click button */
        Button btn = (Button) findViewById(R.id.loginButton);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
               setContentView(R.layout.todays_events);
            }

        });
    }



    }
   // }
//}






