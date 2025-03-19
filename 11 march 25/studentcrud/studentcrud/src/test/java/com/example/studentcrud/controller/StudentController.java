package com.example.studentcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ReuestMapping("/users")
public class StudentController{

@GetMapping
public String list(){
    return "student/index":
}
}
@PostMapping("/save")
public String savestudent (@ModelAttribute Student student){

    

}