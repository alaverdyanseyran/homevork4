package com.example.sey.usersapp.Frags;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sey.usersapp.R;
import com.example.sey.usersapp.UsersAdapter;
import com.example.sey.usersapp.mods_data.DataProvider;

/**
 * A simple {@link Fragment} subclass.
 */
public class UsersFragment extends Fragment {


    public UsersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_users, container, false);
        final RecyclerView usersList = (RecyclerView) view.findViewById(R.id.recycler);

        usersList.setHasFixedSize(true);
        usersList.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        DataProvider dp =DataProvider.getInstance();
        final UsersAdapter adapter =
                new UsersAdapter(getContext(), dp.getUsers());
        usersList.setAdapter(adapter);
        return view;
    }

}
