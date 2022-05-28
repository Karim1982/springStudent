package com.Spring.Student.student.Repository;

import com.Spring.Student.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;


@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student,Long> {

}
