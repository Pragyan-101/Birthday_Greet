package com.example.birthdaygreet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void createBirthday(View view){
        EditText editText = (EditText) findViewById(R.id.inputText);
        String name = editText.getText().toString();
        Intent intent = new Intent(this,BirthdayGreetActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}