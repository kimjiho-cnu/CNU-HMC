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
    int spinner_input_case_idx, road_case_idx, spinner_idx_1, spinner_idx_2,spinner_idx_3,spinner_idx_4 , arrayNumber3;
    Button btn_case_detail;
    CheckBox checkbox_case_detail;
    ArrayAdapter<CharSequence> adapter3;

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

        spinner_idx_3 = -1;
        arrayNumber3 = 0;

        if(spinner_idx_3 == -1){
            arrayNumber3 = R.array.detail_case_array_default3;
        }


        if (road_case_idx == 0) {   // 직선 도로 10개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array00;  // 3
            }else if(spinner_input_case_idx == 1){
                arrayNumber = R.array.detail_case_array01; // 1
            }else if(spinner_input_case_idx == 2){
                arrayNumber = R.array.detail_case_array02;  // 1
            }else if(spinner_input_case_idx == 3){
                arrayNumber = R.array.detail_case_array03;  // 1
            }else if(spinner_input_case_idx == 4){
                arrayNumber = R.array.detail_case_array04;  // 1
            }else if(spinner_input_case_idx == 5){
                arrayNumber = R.array.detail_case_array05;  // 3
            }else if(spinner_input_case_idx == 6){
                arrayNumber = R.array.detail_case_array06;  // 3
            }else if(spinner_input_case_idx == 7){
                arrayNumber = R.array.detail_case_array07;  // 2
            }else if(spinner_input_case_idx == 8){
                arrayNumber = R.array.detail_case_array08;  // 1
            }else if(spinner_input_case_idx == 9){
                arrayNumber = R.array.detail_case_array09;  // 4
            }

        }

        else if (road_case_idx == 1) {    // 사거리 신호등 o 10개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array10;
            }else if(spinner_input_case_idx == 1){
                arrayNumber = R.array.detail_case_array11;
            }else if(spinner_input_case_idx == 2){
                arrayNumber = R.array.detail_case_array12;
            }else if(spinner_input_case_idx == 3){
                arrayNumber = R.array.detail_case_array13;
            }else if(spinner_input_case_idx == 4){
                arrayNumber = R.array.detail_case_array14;
            }else if(spinner_input_case_idx == 5){
                arrayNumber = R.array.detail_case_array15;
            }else if(spinner_input_case_idx == 6){
                arrayNumber = R.array.detail_case_array16;
            }else if(spinner_input_case_idx == 7){
                arrayNumber = R.array.detail_case_array17;
            }else if(spinner_input_case_idx == 8){
                arrayNumber = R.array.detail_case_array18;
            }else if(spinner_input_case_idx == 9){
                arrayNumber = R.array.detail_case_array19;
            }
        }

        else if (road_case_idx == 2) {  // 사거리 신호등 x    11개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array20;
            }else if(spinner_input_case_idx == 1){
                arrayNumber = R.array.detail_case_array21;
            }else if(spinner_input_case_idx == 2){
                arrayNumber = R.array.detail_case_array22;
            }else if(spinner_input_case_idx == 3){
                arrayNumber = R.array.detail_case_array23;
            }else if(spinner_input_case_idx == 4){
                arrayNumber = R.array.detail_case_array24;
            }else if(spinner_input_case_idx == 5){
                arrayNumber = R.array.detail_case_array25;
            }else if(spinner_input_case_idx == 6){
                arrayNumber = R.array.detail_case_array26;
            }else if(spinner_input_case_idx == 7){
                arrayNumber = R.array.detail_case_array27;
            }else if(spinner_input_case_idx == 8){
                arrayNumber = R.array.detail_case_array28;
            }else if(spinner_input_case_idx == 9){
                arrayNumber = R.array.detail_case_array29;
            }else if(spinner_input_case_idx == 10){
                arrayNumber = R.array.detail_case_array21000;
            }
        }

        else if (road_case_idx == 3) {  // T자형 교차로  3개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array30;
            }else if(spinner_input_case_idx == 1){
                arrayNumber = R.array.detail_case_array31;
            }else if(spinner_input_case_idx == 2){
                arrayNumber = R.array.detail_case_array32;
            }
        }

        else if (road_case_idx == 4) {  // 회전 교차로   2개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array40;
            }else if(spinner_input_case_idx == 1){
                arrayNumber = R.array.detail_case_array41;
            }
        }

        else if (road_case_idx == 5) {  //  주차장 및 기타 장소 1개
            if(spinner_input_case_idx == 0){
                arrayNumber = R.array.detail_case_array50;
            }
        }

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_input_case_detail1.setAdapter(adapter);
        spinner_input_case_detail1.setFocusable(true);
        spinner_input_case_detail1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spinner_idx_1 = i;
                if (road_case_idx == 0) {   // 직선 도로 10개
                    if (spinner_input_case_idx == 0) {  // 3
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array000;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array001;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array002;
                        }
                    }else if(spinner_input_case_idx == 1){  // 1
                        arrayNumber3 = R.array.detail_case_array010;
                    }else if(spinner_input_case_idx == 2){  // 1
                        arrayNumber3 = R.array.detail_case_array020;
                    }else if(spinner_input_case_idx == 3){ // 1
                        arrayNumber3 = R.array.detail_case_array030;
                    }else if(spinner_input_case_idx == 4){  // 1
                        arrayNumber3 = R.array.detail_case_array040;
                    }else if(spinner_input_case_idx == 5){ // 3
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array050;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array051;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array052;
                        }
                    }else if(spinner_input_case_idx == 6){ // 3
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array060;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array061;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array062;
                        }
                    }else if(spinner_input_case_idx == 7){ // 2
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array070;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array071;
                        }
                    }else if(spinner_input_case_idx == 8){ // 1
                        arrayNumber3 = R.array.detail_case_array080;
                    }else if(spinner_input_case_idx == 9){ // 4
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array090;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array091;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array092;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array093;
                        }
                    }
                }else if(road_case_idx == 1){   // 신호등 O 10개
                    if (spinner_input_case_idx == 0) {  //7
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array100;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array101;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array102;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array103;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array104;
                        } else if (spinner_idx_1 == 5) {
                            arrayNumber3 = R.array.detail_case_array105;
                        } else if (spinner_idx_1 == 6) {
                            arrayNumber3 = R.array.detail_case_array106;
                        }
                    }else if(spinner_input_case_idx == 1){  // 5
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array110;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array111;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array112;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array113;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array114;
                        }
                    }else if(spinner_input_case_idx == 2){  // 1
                        arrayNumber3 = R.array.detail_case_array120;
                    }else if(spinner_input_case_idx == 3){ // 3
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array130;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array131;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array132;
                        }
                    }else if(spinner_input_case_idx == 4){  // 1
                        arrayNumber3 = R.array.detail_case_array140;
                    }else if(spinner_input_case_idx == 5){// 1
                        arrayNumber3 = R.array.detail_case_array150;
                    }else if(spinner_input_case_idx == 6){// 4
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array160;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array161;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array162;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array163;
                        }
                    }else if(spinner_input_case_idx == 7){ // 1
                        arrayNumber3 = R.array.detail_case_array170;
                    }else if(spinner_input_case_idx == 8){//5
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array180;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array181;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array182;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array183;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array184;
                        }
                    }else if(spinner_input_case_idx == 9){ // 3
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array190;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array191;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array192;
                        }
                    }
                }else if(road_case_idx == 2){   // 신호등 X 11개
                    if (spinner_input_case_idx == 0) {  // 9
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array200;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array201;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array202;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array203;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array204;
                        } else if (spinner_idx_1 == 5) {
                            arrayNumber3 = R.array.detail_case_array205;
                        } else if (spinner_idx_1 == 6) {
                            arrayNumber3 = R.array.detail_case_array206;
                        } else if (spinner_idx_1 == 7) {
                            arrayNumber3 = R.array.detail_case_array207;
                        } else if (spinner_idx_1 == 8) {
                            arrayNumber3 = R.array.detail_case_array208;
                        }
                    }else if(spinner_input_case_idx == 1){ // 12
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array210;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array211;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array212;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array213;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array214;
                        } else if (spinner_idx_1 == 5) {
                            arrayNumber3 = R.array.detail_case_array215;
                        } else if (spinner_idx_1 == 6) {
                            arrayNumber3 = R.array.detail_case_array216;
                        } else if (spinner_idx_1 == 7) {
                            arrayNumber3 = R.array.detail_case_array217;
                        } else if (spinner_idx_1 == 8) {
                            arrayNumber3 = R.array.detail_case_array218;
                        } else if (spinner_idx_1 == 9) {
                            arrayNumber3 = R.array.detail_case_array219;
                        } else if (spinner_idx_1 == 10) {
                            arrayNumber3 = R.array.detail_case_array2100;
                        } else if (spinner_idx_1 == 11) {
                            arrayNumber3 = R.array.detail_case_array2101;
                        }
                    }else if(spinner_input_case_idx == 2){ // 6
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array220;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array221;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array222;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array223;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array224;
                        } else if (spinner_idx_1 == 5) {
                            arrayNumber3 = R.array.detail_case_array225;
                        }
                    }else if(spinner_input_case_idx == 3){ // 1
                        arrayNumber3 = R.array.detail_case_array230;
                    }else if(spinner_input_case_idx == 4){ // 1
                        arrayNumber3 = R.array.detail_case_array240;
                    }else if(spinner_input_case_idx == 5){ // 2
                        arrayNumber3 = R.array.detail_case_array250;
                    }else if(spinner_input_case_idx == 6){ // 1
                        arrayNumber3 = R.array.detail_case_array260;
                    }else if(spinner_input_case_idx == 7){ // 1
                        arrayNumber3 = R.array.detail_case_array270;
                    }else if(spinner_input_case_idx == 8){ // 1
                        arrayNumber3 = R.array.detail_case_array280;
                    }else if(spinner_input_case_idx == 9){ // 1
                        arrayNumber3 = R.array.detail_case_array290;
                    }else if(spinner_input_case_idx == 10){ // 1
                        arrayNumber3 = R.array.detail_case_array210000;
                    }
                }else if(road_case_idx == 3){   // T자형 3
                    if (spinner_input_case_idx == 0) {  // 4
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array300;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array301;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array302;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array303;
                        }
                    }else if(spinner_input_case_idx == 1){ // 6
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array310;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array311;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array312;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array313;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array314;
                        } else if (spinner_idx_1 == 5) {
                            arrayNumber3 = R.array.detail_case_array315;
                        }
                    }else if(spinner_input_case_idx == 2){  // 5
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array320;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array321;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array322;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array323;
                        } else if (spinner_idx_1 == 4) {
                            arrayNumber3 = R.array.detail_case_array324;
                        }
                    }
                }else if(road_case_idx == 4){   // 회전교차로 2
                    if (spinner_input_case_idx == 0) {  // 1
                        arrayNumber3 = R.array.detail_case_array400;
                    }else if(spinner_input_case_idx == 1){     // 4
                        if (spinner_idx_1 == 0) {
                            arrayNumber3 = R.array.detail_case_array410;
                        } else if (spinner_idx_1 == 1) {
                            arrayNumber3 = R.array.detail_case_array411;
                        } else if (spinner_idx_1 == 2) {
                            arrayNumber3 = R.array.detail_case_array412;
                        } else if (spinner_idx_1 == 3) {
                            arrayNumber3 = R.array.detail_case_array413;
                        }
                    }
                }else if(road_case_idx == 5){   // 주차장 1
                    if (spinner_input_case_idx == 0) {
                        if (spinner_idx_1 == 0) {   // 1
                            arrayNumber3 = R.array.detail_case_array500;
                        }
                    }
                }



                adapter3 = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber3, android.R.layout.simple_spinner_item);
                adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                spinner_input_case_detail3.setAdapter(adapter3);
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

    private void settingSpinner4() {
        spinner_idx_4 = 0;

        int arrayNumber3 = 0;

        arrayNumber3 = R.array.case_array_detail_2;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(InputCaseDetailActivity.this, arrayNumber3, android.R.layout.simple_spinner_item);
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