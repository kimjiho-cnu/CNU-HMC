package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

public class InputRoadActivity extends AppCompatActivity {

    Toolbar toolbar_input_road;
    Button btn_road1, btn_road2, btn_road3, btn_road4, btn_road5, btn_road6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_road);

        toolbar_input_road = findViewById(R.id.toolbar_input_road);
        settingActionBar();

        btn_road1 = findViewById(R.id.btn_road1);   // 직선 도로
        btn_road2 = findViewById(R.id.btn_road2);   // 직선 도로
        btn_road3 = findViewById(R.id.btn_road3);   // 직선 도로
        btn_road4 = findViewById(R.id.btn_road4);   // 직선 도로
        btn_road5 = findViewById(R.id.btn_road5);   // 직선 도로
        btn_road6 = findViewById(R.id.btn_road6);   // 직선 도로

        btn_road1.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 0);
            startActivity(intent);
        });

        btn_road2.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 1);
            startActivity(intent);
        });
        btn_road3.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 2);
            startActivity(intent);
        });
        btn_road4.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 3);
            startActivity(intent);
        });
        btn_road5.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 4);
            startActivity(intent);
        });
        btn_road6.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseActivity.class);
            intent.putExtra("ROAD_CASE", 5);
            startActivity(intent);
        });

    }

    private void settingActionBar() {
        setSupportActionBar(toolbar_input_road);

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