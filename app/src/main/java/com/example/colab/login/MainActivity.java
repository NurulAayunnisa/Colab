package com.example.colab.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.colab.Inventory;
import com.example.colab.MonitoringActivity;
import com.example.colab.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goInventoryScreen(View view) {
        startActivity(new Intent(MainActivity.this, Inventory.class));
    }

    public void goMonitoringScreen(View view) {
        startActivity(new Intent(MainActivity.this, MonitoringActivity.class));
    }
}