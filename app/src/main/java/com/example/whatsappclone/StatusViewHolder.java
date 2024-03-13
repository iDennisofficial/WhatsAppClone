package com.example.whatsappclone;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class StatusViewHolder extends RecyclerView.ViewHolder {

    CardView cardViewStatus;
    ImageView imageStatusPost;
    TextView nameTxtStatusPost, timeTxtStatusPost;
    public StatusViewHolder(@NonNull View itemView) {
        super(itemView);
        cardViewStatus = itemView.findViewById(R.id.cardViewStatus);
        imageStatusPost = itemView.findViewById(R.id.imageStatusPost);
        nameTxtStatusPost = itemView.findViewById(R.id.nameTxtStatusPost);
        timeTxtStatusPost = itemView.findViewById(R.id.timeTxtStatusPost);
    }
}
