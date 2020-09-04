package com.nadhu014.loginuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";

    EditText etUserName, etPassword;
    TextView tvUserNameCheck, tvPasswordCheck, tvYourName, tvYourPassword;
    Button btnClear, btnSubmit;
    String userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUserName = findViewById(R.id.et_user_name);
        etPassword = findViewById(R.id.et_password);
        tvUserNameCheck = findViewById(R.id.tv_user_name_check);
        tvPasswordCheck = findViewById(R.id.tv_password_check);
        tvYourName = findViewById(R.id.tv_your_name);
        tvYourPassword = findViewById(R.id.tv_your_password);
        btnClear = findViewById(R.id.btn_clear);
        btnSubmit = findViewById(R.id.btn_submit);

        tvUserNameCheck.setVisibility(View.INVISIBLE);
        tvPasswordCheck.setVisibility(View.INVISIBLE);

        btnClear.setOnClickListener(this);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_clear:
                clear();
                break;
            case R.id.btn_submit:
                if (etUserName.length() == 0) {
                    tvUserNameCheck.setVisibility(View.VISIBLE);
                    tvPasswordCheck.setVisibility(View.INVISIBLE);
                } else if (etPassword.length() <= 3) {
                    tvPasswordCheck.setVisibility(View.VISIBLE);
                    tvUserNameCheck.setVisibility(View.INVISIBLE);
                } else {
                    submit();
                    tvUserNameCheck.setVisibility(View.INVISIBLE);
                    tvPasswordCheck.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    private void clear() {
        etUserName.setText("");
        etPassword.setText("");
        tvYourName.setText("");
        tvYourPassword.setText("");
        Log.d(TAG, "onClick: Clear Button Clicked!!!");
        Toast.makeText(this, "Clear!", Toast.LENGTH_SHORT).show();
    }

    private void submit() {
        userName = String.valueOf(etUserName.getText());
        password = String.valueOf(etPassword.getText());
        Log.d(TAG, "onClick: Submit Button Clicked!!! " + "User Name: " + userName + "Password: " + password);
        tvYourName.setText(userName);
        tvYourPassword.setText(password);
        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
    }
}