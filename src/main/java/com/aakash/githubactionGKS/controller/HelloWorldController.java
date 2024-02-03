package com.aakash.githubactionGKS.controller;

import com.aakash.githubactionGKS.Repository.StudentRepo;
import com.aakash.githubactionGKS.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    public StudentRepo studentRepo;
    @GetMapping("hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hi "+name+" how are you ";
    }

    @GetMapping("/getAllstudents")
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return studentRepo.save(student);
    }
}
