package com.example.colab;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.colab.adapters.KategoriAdapter.OnKategoriListener;
import com.example.colab.adapters.KategoriAdapter;
import com.example.colab.models.Kategori;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends AppCompatActivity implements OnKategoriListener{
    ArrayList<Kategori> dataInventory = new ArrayList<>();
    private RecyclerView RVItemInventory;
    OnKategoriListener onKategoriListener = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        RVItemInventory = findViewById(R.id.RVItemInventory);
        List<Kategori> daftarKategori = getDataInventory();

        KategoriAdapter kategoriAdapter = new KategoriAdapter(this, daftarKategori, onKategoriListener);
        RVItemInventory.setAdapter(kategoriAdapter);
        RVItemInventory.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
    }

    private List<Kategori> getDataInventory(){
        dataInventory.clear();
        dataInventory.add(new Kategori(1, "Keyboard", "K0121", "Keyboard Adalah Blalala", "10 Maret 2020", "11 Maret 2020"));
        dataInventory.add(new Kategori(2, "Mouse", "KASM", "Mouse Adalah Blalala", "10 Maret 2020", "11 Maret 2020"));
        dataInventory.add(new Kategori(3, "PC", "XKSKS", "PC Adalah Blalala", "10 Maret 2020", "11 Maret 2020"));
        dataInventory.add(new Kategori(4, "Kabel", "ASDK", "Kabel Adalah Blalala", "10 Maret 2020", "11 Maret 2020"));
        dataInventory.add(new Kategori(5, "AC", "ASASK", "AC Adalah Blalala", "10 Maret 2020", "11 Maret 2020"));
        return dataInventory;
    }

    @Override
    public void onKategoriListener(int positition) {
        Intent intent = new Intent(this, DetailInventoryActivity.class);
        intent.putExtra("id", dataInventory.get(positition).getId_kategori());
        intent.putExtra("name", dataInventory.get(positition).getName());
        intent.putExtra("code", dataInventory.get(positition).getCode());
        intent.putExtra("information", dataInventory.get(positition).getInformation());
        intent.putExtra("created_at", dataInventory.get(positition).getCreated_at());
        intent.putExtra("updated_at", dataInventory.get(positition).getUpdated_at());
        startActivity(intent);
    }
}