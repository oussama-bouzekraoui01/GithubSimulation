package com.example.learnspring.teacher;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher-sequence", sequenceName = "teacher-sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher-sequence")
    private Long id;
    private String firstname;
    private String lastName;
    private int age;
}
