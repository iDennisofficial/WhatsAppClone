package com.example.whatsappclone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CallsAdapter extends RecyclerView.Adapter<CallsViewHolder> {

    ArrayList<CallsModel> callInformation;

    public CallsAdapter(ArrayList<CallsModel> callInformation) {
        this.callInformation = callInformation;
    }

    @NonNull
    @Override
    public CallsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calls_item, parent, false);
        return new CallsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallsViewHolder holder, int position) {
        CallsModel callsModel = callInformation.get(position);
        holder.imageCalls.setImageResource(callsModel.getImageID());
        holder.nameTxtCalls.setText(callsModel.getName());
        holder.CallTypeTxtCalls.setText(callsModel.getCalLType());

    }

    @Override
    public int getItemCount() {
        return callInformation.size();
    }
}
