package com.example.colab.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.colab.R;
import com.example.colab.models.Kategori;

import java.util.List;

public class KategoriAdapter extends RecyclerView.Adapter<KategoriAdapter.MyViewHolder> {
    Context context ;
    List<Kategori> mData;
    private OnKategoriListener onKategoriListener;


    public KategoriAdapter(Context context, List<Kategori> mData, OnKategoriListener onKategoriListener) {
        this.context = context;
        this.mData = mData;
        this.onKategoriListener = onKategoriListener;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_inventory,viewGroup,false);
        return new MyViewHolder(view, onKategoriListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.TVNameItemInventory.setText(mData.get(i).getName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView TVNameItemInventory;
        private OnKategoriListener onKategoriListener;


        public MyViewHolder(@NonNull View itemView, OnKategoriListener onKategoriListener) {
            super(itemView);
            TVNameItemInventory = itemView.findViewById(R.id.TVNameItemInventory);
            this.onKategoriListener = onKategoriListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onKategoriListener.onKategoriListener(getAdapterPosition());
        }
    }

    public  interface OnKategoriListener{
        void onKategoriListener(int positition);
    }
}
