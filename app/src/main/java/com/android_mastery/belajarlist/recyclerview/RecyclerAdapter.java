package com.android_mastery.belajarlist.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_mastery.belajarlist.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    Context context;
    ArrayList<ListModel> listBuah = new ArrayList<>();

    //constructor
    public RecyclerAdapter(Context context, ArrayList<ListModel> listBuah) {
        this.context = context;
        this.listBuah = listBuah;
    }

    //mengatur layout item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.recycler_item, parent, false);

        return new MyViewHolder(view);
    }

    //set data
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvNamaBuah.setText(listBuah.get(position).getNamaBuah());
        holder.ivGambarBuah.setImageResource(listBuah.get(position).getGambarBuah());
    }

    //hitung jumlah list
    @Override
    public int getItemCount() {
        return listBuah.size();
    }

    //inisialisasi komponen di dalam item
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaBuah;
        ImageView ivGambarBuah;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvNamaBuah = itemView.findViewById(R.id.tv_item_nama);
            ivGambarBuah = itemView.findViewById(R.id.iv_item_gambar);
        }
    }

    //extend
}
