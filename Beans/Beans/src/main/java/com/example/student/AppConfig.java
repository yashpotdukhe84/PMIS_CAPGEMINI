package com.example.student;

import com.example.student.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        return new Student(101, "Yash", "Java Spring Boot");
    }
}