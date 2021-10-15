package com.example.cnu_hmc;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar_main;
    DrawerLayout drawer_main;
    NavigationView nav_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar_main = findViewById(R.id.toolbar_main);
        drawer_main = findViewById(R.id.drawer_main);
        nav_main = findViewById(R.id.nav_main);

        settingActionBarAndNavigation();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            drawer_main.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (drawer_main.isDrawerOpen(GravityCompat.START)) {
            drawer_main.closeDrawers();
        }
    }

    private void settingActionBarAndNavigation() {
        setSupportActionBar(toolbar_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_bars_solid);

        nav_main.setNavigationItemSelectedListener(item -> {
            Intent intent = null;

            switch (item.getItemId()) {
                case R.id.menu_damage:
                    intent = new Intent(MainActivity.this, ChooseTypeActivity.class);
                    break;

                case R.id.menu_logout:
                    intent = new Intent(MainActivity.this, LoginActivity.class);
                    break;
            }

            drawer_main.closeDrawers();
            startActivity(intent);

            return true;
        });
    }

}