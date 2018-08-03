package com.example.sey.usersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.sey.usersapp.Frags.ChatFragment;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        Bundle bandle=new Bundle();
        int pos =getIntent().getExtras().getInt("CHKEY");
        bandle.putInt("TOCHAT", pos);
ChatFragment fr =new ChatFragment();
fr.setArguments(bandle);
        getSupportFragmentManager().beginTransaction().add(R.id.chat_cont,fr ).commit();
    }
}
