package com.example.sey.usersapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.sey.usersapp.mods_data.User;
import com.squareup.picasso.Picasso;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.VHolder> {
    private Context context;
    private List<User> usersList;

    public UsersAdapter(Context context, List<User> usersList) {
        this.context = context;
        this.usersList = usersList;
    }


    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = inflater.inflate(R.layout.card_user, parent, false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, final int pos) {
        final User user = usersList.get(pos);
        vHolder.usName.setText(user.getName());
        vHolder.usPhone.setText(user.getPhone());
        vHolder.usMail.setText(user.getEmail());
        Picasso.with(context)
                .load(user.getAvatUrl())
                .placeholder(R.drawable.ic_holder_24dp)
                .error(R.mipmap.ic_launcher)
                .into(vHolder.usImage);
        vHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatIntent = new Intent(context, Chat.class);
                chatIntent.putExtra("CHKEY", pos);
                context.startActivity(chatIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class VHolder extends RecyclerView.ViewHolder {
        TextView usName, usPhone, usMail;
        CircleImageView usImage;

        VHolder(View itemView) {
            super(itemView);
            usName = itemView.findViewById(R.id.user_name);
            usPhone = itemView.findViewById(R.id.user_phone);
            usMail = itemView.findViewById(R.id.user_mail);
            usImage = itemView.findViewById(R.id.user_avat);

        }
    }

}
