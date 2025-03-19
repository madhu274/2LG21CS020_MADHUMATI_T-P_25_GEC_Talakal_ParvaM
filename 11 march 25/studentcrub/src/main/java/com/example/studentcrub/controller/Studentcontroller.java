package com.example.studentcrub.controller;

import org.springframe.stereotype.controller;
import org.springframe.web.bind.annotation.getmapping;
import org.springframe.web.bind.annotation.request;

@controller
@Requestmapping("/users")
public class Studentcontroller{ 
    @getmapping("/list")
    public String list(){
      return "student/index";
    }

}