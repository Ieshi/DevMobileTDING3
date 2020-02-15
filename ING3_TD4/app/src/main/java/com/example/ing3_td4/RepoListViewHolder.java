package com.example.ing3_td4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RepoListViewHolder  extends RecyclerView.ViewHolder {
    private TextView mNameTV;
    public RepoListViewHolder(@NonNull View itemView) {
        super(itemView);
        mNameTV = itemView.findViewById(R.id.name);
    }
    void display(RepoList repo){
        mNameTV.setText(repo.getRepoName());
    }
}