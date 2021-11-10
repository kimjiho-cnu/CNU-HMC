package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.VideoView;

public class InputCaseActivity extends AppCompatActivity {

    Toolbar toolbar_input_case;
    Spinner spinner_input_case;
    int spinner_idx, road_case_idx;
    Button btn_input_case;
    VideoView input_case_video;
    Uri videoUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_case);

        toolbar_input_case = findViewById(R.id.toolbar_input_case);
        spinner_input_case = findViewById(R.id.spinner_input_case);
        btn_input_case  = findViewById(R.id.btn_case);
        input_case_video = findViewById(R.id.input_case_video);

        road_case_idx = getIntent().getIntExtra("ROAD_CASE", -1);

        settingActionBar();
        settingSpinner();


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
                if (road_case_idx == 0) {
                    if(spinner_idx == 0){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video00);
                    }else if(spinner_idx == 1){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video01);
                    }else if(spinner_idx == 2){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video02);
                    }else if(spinner_idx == 3){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video03);
                    }else if(spinner_idx == 4){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video04);
                    }else if(spinner_idx == 5){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video05);
                    }else if(spinner_idx == 6){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video06);
                    }else if(spinner_idx == 7){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video07);
                    }else if(spinner_idx == 8){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video08);
                    }else if(spinner_idx == 9){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video09);
                    }
                } else if (road_case_idx == 1) {
                    if(spinner_idx == 0){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video10);
                    }else if(spinner_idx == 1){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video11);
                    }else if(spinner_idx == 2){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video12);
                    }else if(spinner_idx == 3){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video13);
                    }else if(spinner_idx == 4){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video14);
                    }else if(spinner_idx == 5){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video15);
                    }else if(spinner_idx == 6){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video16);
                    }else if(spinner_idx == 7){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video17);
                    }else if(spinner_idx == 8){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video18);
                    }else if(spinner_idx == 9){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video19);
                    }
                } else if (road_case_idx == 2) {
                    if(spinner_idx == 0){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video20);
                    }else if(spinner_idx == 1){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video21);
                    }else if(spinner_idx == 2){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video22);
                    }else if(spinner_idx == 3){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video23);
                    }else if(spinner_idx == 4){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video24);
                    }else if(spinner_idx == 5){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video25);
                    }else if(spinner_idx == 6){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video26);
                    }else if(spinner_idx == 7){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video27);
                    }else if(spinner_idx == 8){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video28);
                    }else if(spinner_idx == 9){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video29);
                    }else if(spinner_idx == 10){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video210);
                    }
                } else if (road_case_idx == 3) {
                    videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video30);
                } else if (road_case_idx == 4) {
                    if(spinner_idx == 0){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video40);
                    }else if(spinner_idx == 1){
                        videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video41);
                    }
                } else if (road_case_idx == 5) {
                    videoUri= Uri.parse("android.resource://"+getPackageName() + "/"+R.raw.video50);
                }

                input_case_video.setVideoURI(videoUri);
                input_case_video.setMediaController(new MediaController(input_case_video.getContext()));

                input_case_video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {

                        //비디오 시작
                        input_case_video.start();
                    }
                });
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

    @Override
    protected void onPause() {
        super.onPause();

        //비디오 일시 정지
        if(input_case_video!=null && input_case_video.isPlaying()) input_case_video.pause();
    }
    //액티비티가 메모리에서 사라질때..
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //
        if(input_case_video!=null) input_case_video.stopPlayback();
    }
}