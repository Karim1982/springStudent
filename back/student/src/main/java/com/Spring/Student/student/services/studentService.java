package com.Spring.Student.student.services;

import com.Spring.Student.student.Repository.StudentRepository;
import com.Spring.Student.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getService(){
        return studentRepository.findAll();
    }

}
