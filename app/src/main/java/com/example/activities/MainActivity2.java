package com.example.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText input = findViewById(R.id.input);

        Intent intent = getIntent();
        input.setHint(intent.getStringExtra("text"));
        input.setBackgroundColor(intent.getIntExtra("color", Color.WHITE));

        Button sendButton = findViewById(R.id.sendButton);
        Button cancelButton = findViewById(R.id.cancelButton);
        Button enterButton = findViewById(R.id.enterButton);

        EditText nickInput = findViewById(R.id.nick);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("text", input.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nick = nickInput.getText().toString();
                if (nick.equalsIgnoreCase("sonia")) {
                    User user = new User("Sonia", "Sanchez", 'm', nick);
                    Intent login = new Intent(MainActivity2.this, UserActivity.class);
                    login.putExtra("user", user);
                    startActivity(login);
                }
            }
        });
    }
}