package com.hpcnt.recyclerviewstudy.recyclerviewstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hpcnt.recyclerviewstudy.recyclerviewstudy.adapter.MyRecyclerViewAdapter;
import com.hpcnt.recyclerviewstudy.recyclerviewstudy.vo.Album;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        ArrayList<Album> albumList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Album album = new Album();
            album.setTitle("긴자 야경");
            album.setArtist("일본 : " + (i+1));
            album.setImage(R.drawable.test_image);
            albumList.add(album);
        }
        recyclerView.setAdapter(new MyRecyclerViewAdapter(albumList, R.layout.view_main));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}
