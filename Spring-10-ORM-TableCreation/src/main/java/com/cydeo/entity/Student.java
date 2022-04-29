package com.cydeo.entity;

import com.cydeo.enums.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_FistName")
    private String firstName;
    @Column(name = "student_LastName")
    private String lastName;
    private String email;

    @Transient // column will not be created
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;
    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;
    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate birthDateAndTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
