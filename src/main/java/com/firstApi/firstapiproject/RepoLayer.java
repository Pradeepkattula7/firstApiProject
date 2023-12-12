package com.firstApi.firstapiproject;


import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
//this layer contains databases
public class RepoLayer {

    Map<Integer, UserInfo> map=new HashMap<>();



    public  String addUser(UserInfo obj){

        int key=obj.getId();

        map.put(key,obj);

        return "data added ";
    }

    public List<UserInfo> getUsers(){

        return  map.values().stream().toList();
    }

}
