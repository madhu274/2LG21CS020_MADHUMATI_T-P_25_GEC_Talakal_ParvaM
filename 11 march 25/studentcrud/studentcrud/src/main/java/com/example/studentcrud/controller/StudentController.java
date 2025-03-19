
package com.example.studentcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.studentcrud.model.Student;

@Controller
@RequestMapping("/users")
public class StudentController {
    @GetMapping
    public String list(){
        return "student/index";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model .addAttribute("student",new Student());
        return "student/create";
    }
}
@PostMapping("/save")
public String savestudent (@ModelAttribute Student student){
 studentService.save(stu)
 return
}