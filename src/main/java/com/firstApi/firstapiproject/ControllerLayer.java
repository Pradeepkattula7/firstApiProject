package com.firstApi.firstapiproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
//this layer contains endpoints of apis
public class ControllerLayer {

    @Autowired
    ServiceLayer serviceLayer;

    @PostMapping("/addDataViaBody")
    public  String addUser(@RequestBody UserInfo obj){

        String ans=serviceLayer.addUser(obj);

        return ans;
    }

    @GetMapping("/getUsers")
    public List<UserInfo> getUsers(){

       return serviceLayer.getUsers();

    }

    @GetMapping("/getAllUsers/{age1}/{age2}")
    public List<UserInfo> getAllUsers(@PathVariable("age1") Integer  age1,@PathVariable("age2") Integer age2){

        return serviceLayer.getAllUsers(age1,age2);
    }

    @GetMapping("/userNames")
    public List<String> getNames(){

        return serviceLayer.getNames();
    }

}
