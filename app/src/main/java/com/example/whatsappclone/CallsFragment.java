package com.example.whatsappclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CallsFragment extends Fragment {
 RecyclerView recycleViewCalls;
 CallsAdapter adapter;
 ArrayList<CallsModel> arrayList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calls, container, false);

        recycleViewCalls = view.findViewById(R.id.recycleViewCalls);

        int[] image = {R.drawable.c,R.drawable.b,R.drawable.a};
        String[] name ={"Mtema", "Malopa", "Nuru Emnanuel"};
        String[] CallType = {getString(R.string.CallType1),getString(R.string.CallType2),getString(R.string.CallType3)};

        for (int i = 0; i < image.length; i++){

            CallsModel callsModel = new CallsModel(image[i], name[i], CallType[i]);

            arrayList.add(callsModel);

        }

        adapter = new CallsAdapter(arrayList);
        recycleViewCalls.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleViewCalls.setAdapter(adapter);

        return  view;
    }
}