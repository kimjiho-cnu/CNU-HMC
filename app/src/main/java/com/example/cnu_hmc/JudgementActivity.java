package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

public class JudgementActivity extends AppCompatActivity {

    Button btn_judgement;
    Toolbar toolbar_judgement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_judgement);

        btn_judgement = findViewById(R.id.btn_judgement);
        toolbar_judgement = findViewById(R.id.toolbar_judgement);

        settingActionBar();

        btn_judgement.setOnClickListener(view -> {    // 메인 페이지로
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

    }

    private void settingActionBar() {
        setSupportActionBar(toolbar_judgement);

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