package com.example.android.campusapp;

import android.app.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by elsabergman on 2017-03-31.
 */

public class todays_events  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todays_events);

        TextView myTextView = (TextView) findViewById(R.id.title);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "fonts/JosefinSans-Regular.ttf");
        myTextView.setTypeface(typeface);

    }
}
