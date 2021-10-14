package com.example.cnu_hmc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    Button btnLoginDetail, btnSignUpDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLoginDetail = findViewById(R.id.btn_login_detail);
        btnSignUpDetail = findViewById(R.id.btn_signup_detail);

        btnLoginDetail.setOnClickListener(view -> {
            Intent intent = new Intent(this, LogInDetailActivity.class);
            startActivity(intent);
        });

        btnSignUpDetail.setOnClickListener(view -> {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        });
    }


}