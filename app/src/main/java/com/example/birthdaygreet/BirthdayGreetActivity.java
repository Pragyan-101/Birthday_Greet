package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BirthdayGreetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greet);
        String name = getIntent().getStringExtra("name");
        TextView editText2 = (TextView) findViewById(R.id.birthdayGreeting);
        editText2.setText("Happy Birthday\n"+ name+"!!");

    }
}