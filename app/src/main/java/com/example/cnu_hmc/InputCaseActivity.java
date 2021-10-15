package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class InputCaseActivity extends AppCompatActivity {

    Toolbar toolbar_input_case;
    Spinner spinner_input_case;
    int spinner_idx, road_case_idx;
    Button btn_input_case;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_case);

        toolbar_input_case = findViewById(R.id.toolbar_input_case);
        spinner_input_case = findViewById(R.id.spinner_input_case);
        btn_input_case  = findViewById(R.id.btn_case);

        road_case_idx = getIntent().getIntExtra("ROAD_CASE", -1);

        settingActionBar();
        settingSpinner();

          // 직선 도로

        btn_input_case.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputCaseDetailActivity.class);
            intent.putExtra("ROAD_CASE", road_case_idx);
            intent.putExtra("INPUT_CASE", spinner_idx);
            startActivity(intent);
        });

    }

    private void settingSpinner() {
        spinner_idx = 0;

        int arrayNumber = 0;

        if (road_case_idx == 0) {
            arrayNumber = R.array.case_array1;
        } else if (road_case_idx == 1) {
            arrayNumber = R.array.case_array2;
        } else if (road_case_idx == 2) {
            arrayNumber = R.array.case_array3;
        } else if (road_case_idx == 3) {
            arrayNumber = R.array.case_array4;
        } else if (road_case_idx == 4) {
            arrayNumber = R.array.case_array5;
        } else if (road_case_idx == 5) {
            arrayNumber = R.array.case_array6;
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case.setAdapter(adapter);
        spinner_input_case.setFocusable(true);
        spinner_input_case.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void settingActionBar() {
        setSupportActionBar(toolbar_input_case);

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