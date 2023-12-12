package com.firstApi.firstapiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//this layer contains logic of program
public class ServiceLayer {

    @Autowired
    public  RepoLayer repoLayer;


    public  String addUser(UserInfo obj){

        String ans=repoLayer.addUser(obj);

        return ans;
    }

    public List<UserInfo> getUsers(){

        return repoLayer.getUsers();
    }

    public  List<UserInfo> getAllUsers(int age1,int age2){

        List<UserInfo> list=repoLayer.getUsers();

        List<UserInfo> list1=new ArrayList<>();

        for(UserInfo obj:list){
            if(obj.getAge()>=age1 && obj.getAge()<=age2){
                list1.add(obj);
            }
        }

        return list1;
    }

    public List<String> getNames(){

        List<UserInfo> list=repoLayer.getUsers();

        List<String> list1=new ArrayList<>();

        for(UserInfo obj:list){
            list1.add(obj.getName());
        }

        return list1;
    }
}
