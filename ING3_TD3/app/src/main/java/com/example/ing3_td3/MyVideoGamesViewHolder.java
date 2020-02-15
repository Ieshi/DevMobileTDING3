package com.example.ing3_td3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyVideoGamesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvName;
    private TextView tvPrice;

    public MyVideoGamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvName = (TextView) itemView.findViewById(R.id.name);
        tvPrice = (TextView) itemView.findViewById(R.id.price);
    }

    void display(JeuVideo jeuVideo){
        tvName.setText(jeuVideo.getName());
        tvPrice.setText(jeuVideo.getPrice() + "$");
    }
}
