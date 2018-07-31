package com.android_mastery.belajarlist.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android_mastery.belajarlist.R;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recycler;
    ArrayList<ListModel> listBuah = new ArrayList<>();

    String[] namaBuah = {
            "Alpukat",
            "Apel",
            "Ceri",
            "Durian",
            "Jambu Air",
            "Manggis",
            "Strawberry"
    };

    int[] gambarBuah = {
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recycler = findViewById(R.id.recycler_view);

        // data --> model
//        ListModel buah1 = new ListModel("Alpukat", R.drawable.alpukat);
//        listBuah.add(buah1);
//
//        ListModel buah2 = new ListModel("Apel", R.drawable.apel);
//        listBuah.add(buah2);


        for (int i = 0; i < namaBuah.length; i++) {
            ListModel buah = new ListModel(namaBuah[i], gambarBuah[i]);
            listBuah.add(buah);
        }

        // adapter
        recycler.setAdapter(new RecyclerAdapter(RecyclerActivity.this, listBuah));

        // layoutmanager
        recycler.setLayoutManager(new LinearLayoutManager(RecyclerActivity.this));
    }
}
