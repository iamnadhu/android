package com.nadhu014.myfirstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvHeading;
    Button btnReset, btnSubmit;
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHeading = findViewById(R.id.tv_heading);
        btnReset = findViewById(R.id.btn_reset);
        btnSubmit = findViewById(R.id.btn_submit);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Reset Button Clicked...");
                Log.d(TAG, "onClick: Reset Button Clicked...");
                Toast.makeText(MainActivity.this, "Reset Button Clicked!", Toast.LENGTH_SHORT).show();
                tvHeading.setText("My First App!");
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Reset Button Clicked...");
                Log.d(TAG, "onClick: Submit Button Clicked...");
                Toast.makeText(MainActivity.this, "Submit Button Clicked!", Toast.LENGTH_SHORT).show();
                tvHeading.setText("Welcome to Android.");
            }
        });
    }
}