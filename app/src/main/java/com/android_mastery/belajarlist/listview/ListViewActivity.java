package com.android_mastery.belajarlist.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.android_mastery.belajarlist.R;

public class ListViewActivity extends AppCompatActivity {

    ListView list;

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
        setContentView(R.layout.activity_list_view);

        list = findViewById(R.id.list_view);

        // ArrayAdapter adapter = new ArrayAdapter(ListViewActivity.this, android.R.layout.simple_list_item_1, namaBuah);

        ListAdapter adapter = new ListAdapter(ListViewActivity.this, namaBuah, gambarBuah);

        list.setAdapter(adapter);
    }
}
