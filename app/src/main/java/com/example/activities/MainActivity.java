package com.example.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changeActivity = new Intent(MainActivity.this, MainActivity2.class);
                changeActivity.putExtra("text", "Introduce nick");
                changeActivity.putExtra("color", Color.CYAN);
                startActivityForResult(changeActivity, 1);
            }
        });

        RadioButton email = findViewById(R.id.email);
        RadioButton telefono = findViewById(R.id.telefono);

        Button action = findViewById(R.id.action);

        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, );
                if(email.isChecked()) {

                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Toast.makeText(MainActivity.this, data.getStringExtra("text"), Toast.LENGTH_LONG).show();
        } else if (requestCode == 1 && resultCode == RESULT_CANCELED) {
            Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show();
        }
    }


}