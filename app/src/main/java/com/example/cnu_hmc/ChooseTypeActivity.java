package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class ChooseTypeActivity extends AppCompatActivity {

    Toolbar toolbarChooseType;
    ImageView imageview_carvscar,imageview_carvsbicycle,imageview_carvsman,imageview_carvstwowheel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);





        imageview_carvscar = findViewById(R.id.imageview_carvscar);
        imageview_carvsbicycle = findViewById(R.id.imageview_carvsbicycle);
        imageview_carvsman = findViewById(R.id.imageview_carvsman);
        imageview_carvstwowheel = findViewById(R.id.imageview_carvstwowheel);

        imageview_carvscar.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputRoadActivity.class);
            startActivity(intent);
        });

        imageview_carvsbicycle.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputRoadActivity.class);
            startActivity(intent);
        });

        imageview_carvsman.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputRoadActivity.class);
            startActivity(intent);
        });

        imageview_carvstwowheel.setOnClickListener(view -> {
            Intent intent = new Intent(this, InputRoadActivity.class);
            startActivity(intent);
        });


        toolbarChooseType = findViewById(R.id.toolbar_choose_type);
        settingActionBar();
    }


    private void settingActionBar() {
        setSupportActionBar(toolbarChooseType);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_chevron_left_solid_black);
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