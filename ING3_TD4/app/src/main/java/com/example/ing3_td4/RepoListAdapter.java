package com.example.ing3_td4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RepoListAdapter extends RecyclerView.Adapter<RepoListViewHolder> {
    private List<RepoList> repoList;
    public RepoListAdapter(List<RepoList>  repoList) {
        this.repoList = repoList;
    }

    @NonNull
    @Override
    public RepoListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_repo,
                parent, false);
        return new RepoListViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RepoListViewHolder holder, int position) {
        holder.display(repoList.get(position));
    }
    @Override
    public int getItemCount() {
        return repoList.size();
    }
}