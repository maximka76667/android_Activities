package com.example.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent userIntent = getIntent();
        User user = (User) userIntent.getSerializableExtra("user");

        TextView textView = findViewById(R.id.textView);
        
        textView.setText(user.getName() + " " + user.getNickname() + " " + user.getSexo());
    }
}