package com.example.whatsappclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {

    ArrayList<ChatModel> contactInformation;

    public ChatAdapter(ArrayList<ChatModel> contactInformation) {
        this.contactInformation = contactInformation;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chats_item, parent, false);

        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {

        ChatModel chatModel = contactInformation.get(position);
        holder.imageChat.setImageResource(chatModel.getImageID());
        holder.nameTxtChat.setText(chatModel.getName());
        holder.messageTxtChat.setText(chatModel.getMessage());

    }

    @Override
    public int getItemCount() {
        return contactInformation.size();
    }
}
