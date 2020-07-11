package com.example.colab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailInventoryActivity extends AppCompatActivity {
    private TextView TVNameDetailInventory, TVInformationDetailInventory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_inventory);

        TVNameDetailInventory = findViewById(R.id.TVNameDetailInventory);
        TVInformationDetailInventory = findViewById(R.id.TVInformationDetailInventory);

        TVNameDetailInventory.setText(getIntent().getStringExtra("name"));
        TVInformationDetailInventory.setText(getIntent().getStringExtra("information"));
    }
}