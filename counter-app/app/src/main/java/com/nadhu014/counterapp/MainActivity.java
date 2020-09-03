package com.nadhu014.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView tvCount;
    Button btnMinus, btnPlus, btnReset;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tv_count);
        btnMinus = findViewById(R.id.btn_minus);
        btnPlus = findViewById(R.id.btn_plus);
        btnReset = findViewById(R.id.btn_reset);
    }

    public void btnClickAction(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_minus:
                counter = Integer.parseInt(String.valueOf(tvCount.getText()));
                counter--;
                tvCount.setText(String.valueOf(counter));
                Log.d(TAG, "btnClickAction: Minus Button Pressed!" + counter);
                break;
            case R.id.btn_plus:
                counter = Integer.parseInt(String.valueOf(tvCount.getText()));
                counter++;
                tvCount.setText(String.valueOf(counter));
                Log.d(TAG, "btnClickAction: Plus Button Pressed!" + counter);
                break;
            case R.id.btn_reset:
                tvCount.setText("0");
                Log.d(TAG, "btnClickAction: Reset Button Pressed!");
                break;
            default:
                Log.d(TAG, "btnClickAction: Default Case!");
        }
    }
}