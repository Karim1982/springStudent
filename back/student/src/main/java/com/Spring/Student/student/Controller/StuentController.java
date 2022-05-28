package com.Spring.Student.student.Controller;

import com.Spring.Student.student.model.Student;
import com.Spring.Student.student.services.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StuentController {
    @Autowired
   studentService studentService;
    @GetMapping
    //localhost:8080/student
    public List<Student> getAll(){
        return studentService.getService();
    }

}
