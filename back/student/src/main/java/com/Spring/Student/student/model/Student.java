package com.Spring.Student.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "Name")
    private String fullname;
    @Column(name="num_tel")
    private String phone;
    private String age;
    private String adress;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @CreationTimestamp
    @Column(name = "dateCreate")
    private Date dateCreate;
    @UpdateTimestamp
    private Date dateUpdate;
}
