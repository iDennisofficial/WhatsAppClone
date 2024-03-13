package com.example.whatsappclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusViewHolder> {

    ArrayList<StatusModel> statusInformation;

    public StatusAdapter(ArrayList<StatusModel> statusInformation) {
        this.statusInformation = statusInformation;
    }

    @NonNull
    @Override
    public StatusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item, parent, false);

        return new StatusViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusViewHolder holder, int position) {

        StatusModel statusModel = statusInformation.get(position);
        holder.imageStatusPost.setImageResource(statusModel.getImageID());
        holder.nameTxtStatusPost.setText(statusModel.getName());
        holder.timeTxtStatusPost.setText(statusModel.getTime());

    }

    @Override
    public int getItemCount() {
        return statusInformation.size();
    }
}
