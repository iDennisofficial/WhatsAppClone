package com.example.whatsappclone;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    ImageView imageChat;
    TextView nameTxtChat, messageTxtChat;
    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);

        imageChat = itemView.findViewById(R.id.imageChat);
        nameTxtChat = itemView.findViewById(R.id.nameTxtChat);
        messageTxtChat = itemView.findViewById(R.id.messageTxtChat);
    }
}
