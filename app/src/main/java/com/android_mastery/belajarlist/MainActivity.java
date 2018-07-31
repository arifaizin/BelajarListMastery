package com.android_mastery.belajarlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android_mastery.belajarlist.listview.ListViewActivity;
import com.android_mastery.belajarlist.recyclerview.RecyclerActivity;

public class MainActivity extends AppCompatActivity {

    Button btnListView, btnRecyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListView = findViewById(R.id.btn_listview);
        btnRecyclerview = findViewById(R.id.btn_recyclerview);

        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(pindah);
            }
        });

        btnRecyclerview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(pindah);
            }
        });
    }
}
