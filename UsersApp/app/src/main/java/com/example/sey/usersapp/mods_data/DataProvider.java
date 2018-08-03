package com.example.sey.usersapp.mods_data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<User> users;
    private static final DataProvider ourInstance = new DataProvider();

    public static List<User> getUsers() {
        return users;
    }

    public static DataProvider getInstance() {
        if(users==null)
        { users=new ArrayList<>();
        users.add(new User("user1", "9999999", "user1@prov.am", "https://png.icons8.com/color/2x/administrator-male.png" ));
        users.add(new User("user2", "9999999", "user2@prov.am", "https://png.icons8.com/dotty/2x/administrator-male.png" ));
        users.add(new User("user3", "9999999", "user3@prov.am", "https://png.icons8.com/nolan/2x/administrator-male.png" ));
        users.add(new User("user4", "9999999", "user4@prov.am", "https://png.icons8.com/nolan/2x/user.png" ));
        for (int i = 0; i <users.size() ; i++) {
            ArrayList<Message> m =new ArrayList<>();
            for (int j = 0; j <4 ; j++) {
               m.add(new Message("mass "+i+" " +j, (i==j)));

            }
            users.get(i).setMessages(m);
        }}
        return ourInstance;
    }

    private DataProvider() {
    }
}
