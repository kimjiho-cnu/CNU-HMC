package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    Button btn_result1, btn_result2;
    Toolbar toolbar_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btn_result1 = findViewById(R.id.btn_result1);
        btn_result2 = findViewById(R.id.btn_result2);
        toolbar_result = findViewById(R.id.toolbar_result);

        settingActionBar();

        btn_result1.setOnClickListener(view -> {    // 유사 판례
            Intent intent = new Intent(this, JudgementActivity.class);
            startActivity(intent);
        });

        btn_result2.setOnClickListener(view -> {    // 메인 페이지로
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

    }

    private void settingActionBar() {
        setSupportActionBar(toolbar_result);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_chevron_left_solid);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}