package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Student getStudent() {
        return studentService.getStudent();
    }
}