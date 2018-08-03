package com.example.sey.usersapp.Frags;


import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.sey.usersapp.ChatAdapter;
import com.example.sey.usersapp.R;
import com.example.sey.usersapp.mods_data.DataProvider;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatFragment extends Fragment {


    public ChatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =inflater.inflate(R.layout.fragment_chat, container, false);
        final RecyclerView rcView = (RecyclerView) view.findViewById(R.id.chRecycler);
       int pos = getArguments().getInt("TOCHAT");
       DataProvider dp = DataProvider.getInstance();
       rcView.setHasFixedSize(true);
        rcView.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        ChatAdapter chatAdapter =new ChatAdapter(getContext(), dp.getUsers().get(pos).getMessages());
rcView.setAdapter(chatAdapter);

        return view;


    }

}
