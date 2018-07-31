package com.android_mastery.belajarlist.listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android_mastery.belajarlist.R;

public class ListAdapter extends ArrayAdapter {
    Context context;
    String[] namaBuah;
    int[] gambarBuah;

    //membuat constructor
    //klik kanan > generate > constructor

    public ListAdapter(Context context, String[] namaBuah, int[] gambarBuah) {
        super(context, R.layout. list_item, namaBuah);
        this.context = context;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    //extend kelas ini ke ArrayAdapter

    //panggil method getView

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //mengatur layout item
        LayoutInflater inflater = LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.list_item, parent, false);

        //inisialisasi komponen di dalam item
        TextView tvNamaBuah = view.findViewById(R.id.tv_item_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_item_gambar);

        //set data
        tvNamaBuah.setText(namaBuah[position]);
        ivGambarBuah.setImageResource(gambarBuah[position]);

        return view;
    }
}
