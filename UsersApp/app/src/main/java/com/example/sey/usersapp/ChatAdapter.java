package com.example.sey.usersapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sey.usersapp.mods_data.Message;
import com.example.sey.usersapp.mods_data.User;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.VHolder>{
   private Context context;
   private ArrayList<Message> messages;

    public ChatAdapter(Context context, ArrayList<Message> messages) {
        this.context = context;
        this.messages = messages;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view;
        if(!messages.get(i).getMine())
        {view = inflater.inflate(R.layout.card_chat_mine, parent, false);}
        else {
           view = inflater.inflate(R.layout.card_chat, parent, false);
        }
        return new ChatAdapter.VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, int i) {
        final Message messc = messages.get(i);
        vHolder.message.setText(messc.getMessage());
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    public class VHolder extends RecyclerView.ViewHolder{

        TextView message;
        VHolder(View v){
            super(v);
            message = v.findViewById(R.id.mess);
        }
    }


}
