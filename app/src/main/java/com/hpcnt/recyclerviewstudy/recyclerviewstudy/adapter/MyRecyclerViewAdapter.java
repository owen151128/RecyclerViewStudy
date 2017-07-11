package com.hpcnt.recyclerviewstudy.recyclerviewstudy.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hpcnt.recyclerviewstudy.recyclerviewstudy.R;
import com.hpcnt.recyclerviewstudy.recyclerviewstudy.vo.Album;

import java.util.ArrayList;

/**
 * Created by 0wen151128 on 2017. 7. 11..
 */

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private ArrayList<Album> albumList;
    private int itemLayout;

    public MyRecyclerViewAdapter(ArrayList<Album> items, int itemLayout) {

        this.albumList = items;
        this.itemLayout = itemLayout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(itemLayout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {

        Album item = albumList.get(position);
        viewHolder.textTitle.setText(item.getTitle());
        viewHolder.textArtist.setText(item.getArtist());
        viewHolder.img.setBackgroundResource(item.getImage());
        viewHolder.itemView.setTag(item);

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView textTitle;
        TextView textArtist;

        ViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.imgProfile);
            textTitle = (TextView) itemView.findViewById(R.id.textTitle);
            textArtist = (TextView) itemView.findViewById(R.id.textArtist);
        }

    }
}