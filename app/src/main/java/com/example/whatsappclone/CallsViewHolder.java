package com.example.whatsappclone;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;


public class CallsViewHolder extends RecyclerView.ViewHolder {

    MaterialCardView cardViewCalls;
    ShapeableImageView imageCalls;
    MaterialTextView nameTxtCalls, CallTypeTxtCalls;

    public CallsViewHolder(@NonNull View itemView) {
        super(itemView);
        cardViewCalls = itemView.findViewById(R.id.cardViewCalls);
        imageCalls = itemView.findViewById(R.id.imageCalls);
        nameTxtCalls = itemView.findViewById(R.id.nameTxtCalls);
        CallTypeTxtCalls = itemView.findViewById(R.id.CallTypeTxtCalls);

    }
}
