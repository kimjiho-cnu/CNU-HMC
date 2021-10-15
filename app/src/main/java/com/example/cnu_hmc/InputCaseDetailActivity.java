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
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

public class InputCaseDetailActivity extends AppCompatActivity {

    Toolbar toolbar_input_case_detail;
    Spinner spinner_input_case_detail1, spinner_input_case_detail2, spinner_input_case_detail3, spinner_input_case_detail4;
    int spinner_input_case_idx, road_case_idx, spinner_idx_1, spinner_idx_2,spinner_idx_3,spinner_idx_4;
    Button btn_case_detail;
    CheckBox checkbox_case_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_case_detail);

        toolbar_input_case_detail = findViewById(R.id.toolbar_input_case_detail);
        spinner_input_case_detail1 = findViewById(R.id.spinner_input_case_detail1);
        spinner_input_case_detail2 = findViewById(R.id.spinner_input_case_detail2);
        spinner_input_case_detail3 = findViewById(R.id.spinner_input_case_detail3);
        spinner_input_case_detail4 = findViewById(R.id.spinner_input_case_detail4);
        btn_case_detail  = findViewById(R.id.btn_case_detail);
        checkbox_case_detail = findViewById(R.id.checkbox_case_detail);

        road_case_idx = getIntent().getIntExtra("ROAD_CASE", -1);
        spinner_input_case_idx = getIntent().getIntExtra("INPUT_CASE", -1);

        settingActionBar();
        settingSpinner1();
        settingSpinner2();
        settingSpinner3();
        settingSpinner4();

        btn_case_detail.setOnClickListener(view -> {
            if(checkbox_case_detail.isChecked()){   // 동의 체크
                Intent intent = new Intent(this, ResultActivity.class);
                intent.putExtra("ROAD_CASE", road_case_idx);
                intent.putExtra("INPUT_CASE", spinner_input_case_idx);
                startActivity(intent);
            }else{
                Toast.makeText(getApplicationContext(), "사고 정보 수집 동의를 해주세요.", Toast.LENGTH_LONG).show();
            }

        });


    }

    private void settingSpinner1() {
        spinner_idx_1 = 0;

        int arrayNumber = 0;

        arrayNumber = R.array.case_array1;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case_detail1.setAdapter(adapter);
        spinner_input_case_detail1.setFocusable(true);
        spinner_input_case_detail1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx_1 = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void settingSpinner2() {
        spinner_idx_2 = 0;

        int arrayNumber = 0;

        arrayNumber = R.array.case_array_detail_2;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case_detail2.setAdapter(adapter);
        spinner_input_case_detail2.setFocusable(true);
        spinner_input_case_detail2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx_2 = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void settingSpinner3() {
        spinner_idx_3 = 0;

        int arrayNumber = 0;

        arrayNumber = R.array.case_array1;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case_detail3.setAdapter(adapter);
        spinner_input_case_detail3.setFocusable(true);
        spinner_input_case_detail3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx_3 = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void settingSpinner4() {
        spinner_idx_4 = 0;

        int arrayNumber = 0;

        arrayNumber = R.array.case_array_detail_2;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case_detail4.setAdapter(adapter);
        spinner_input_case_detail4.setFocusable(true);
        spinner_input_case_detail4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx_4 = i;
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void settingActionBar() {
        setSupportActionBar(toolbar_input_case_detail);

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