package com.example.student.service;

import com.example.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final Student student;

    public StudentService(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }
}