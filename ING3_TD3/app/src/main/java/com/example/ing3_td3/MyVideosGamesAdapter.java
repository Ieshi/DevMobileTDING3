package com.example.ing3_td3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyVideosGamesAdapter extends RecyclerView.Adapter<MyVideoGamesViewHolder> {
    private List<JeuVideo> mesJeux;
    public MyVideosGamesAdapter(List<JeuVideo> mesJeux) {
        this.mesJeux = mesJeux;
    }
    @NonNull
    @Override
    public MyVideoGamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jeu_video,
                parent, false);
        return new MyVideoGamesViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull MyVideoGamesViewHolder holder, int position) {
        holder.display(mesJeux.get(position));
    }
    @Override
    public int getItemCount() {
        return mesJeux.size();
    }
}