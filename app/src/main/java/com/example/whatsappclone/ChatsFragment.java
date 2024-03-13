package com.example.whatsappclone;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ChatsFragment extends Fragment {

     RecyclerView recycleViewChat;
     ChatAdapter adapter;
    public ArrayList<ChatModel> arrayList = new ArrayList<>();




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        recycleViewChat = view.findViewById(R.id.recycleViewChat);

        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.a, R.drawable.b, R.drawable.c};
        String[] name = {"Mateo", "MoCU", "Kijumbe", "Steven", "Malopa", "Oswald", "Usaidu", "Avidii", "Nuru"};
        String[] message ={getString(R.string.a_message), getString(R.string.b_message), getString(R.string.c_message),
                getString(R.string.a_message), getString(R.string.b_message), getString(R.string.c_message),
                getString(R.string.a_message), getString(R.string.b_message), getString(R.string.c_message)};


       for (int i = 0; i < images.length; i++){
          ChatModel chatModel = new ChatModel(images[i], name[i], message[i]);

           arrayList.add(chatModel);

       }

        adapter = new ChatAdapter(arrayList);

        recycleViewChat.setLayoutManager(new LinearLayoutManager(getContext()));
        recycleViewChat.setAdapter(adapter);


        return view;


    }
}