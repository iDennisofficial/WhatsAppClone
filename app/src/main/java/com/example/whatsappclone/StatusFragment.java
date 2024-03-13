package com.example.whatsappclone;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class StatusFragment extends Fragment {

    RecyclerView recyclerViewStatusPost;

    StatusAdapter adapter;
    ArrayList<StatusModel> arrayList = new ArrayList<>();
    StatusModel statusModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_status, container, false);
         //Hakikisha inakuwa ndani ya function onCreateView
        recyclerViewStatusPost = view.findViewById(R.id.recyclerViewStatusPost);

        int[] images = {R.drawable.c, R.drawable.b, R.drawable.a, R.drawable.c, R.drawable.b, R.drawable.a, R.drawable.a, R.drawable.c, R.drawable.b};
        String[] names = {"Denis", "Steven", "Gasper", "Brian", "Matiko", "Eric", "Diocriss", "Damas", "Enock" };
        String[] Time = {getString(R.string.statusTime1), getString(R.string.statusTime2), getString(R.string.statusTime3),
                getString(R.string.statusTime1), getString(R.string.statusTime2), getString(R.string.statusTime3),
                getString(R.string.statusTime1), getString(R.string.statusTime2), getString(R.string.statusTime3)};

        for (int i = 0; i< images.length; i++) {

            statusModel = new StatusModel(images[i], names[i], Time[i]);
            arrayList.add(statusModel);

        }

        adapter = new StatusAdapter(arrayList);
        recyclerViewStatusPost.setLayoutManager( new LinearLayoutManager(getContext()));
        recyclerViewStatusPost.setAdapter(adapter);

        return view;



    }
}