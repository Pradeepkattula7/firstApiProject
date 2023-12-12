package com.firstApi.firstapiproject;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.*;

@RestController
public class Api {



    Map<Integer, UserInfo> mp=new HashMap<>();


    @PostMapping("/addData")
    public String addDataToDb(@RequestParam("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("age") Integer age,
                              @RequestParam("emailId") String emailId){

        UserInfo obj=new UserInfo(id,name,age,emailId);

        mp.put(id,obj);

        return "data added successFully";
    }


}
