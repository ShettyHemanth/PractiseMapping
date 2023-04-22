package com.hemanth.SpringBootMapping.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


    @Data
    @NoArgsConstructor
    @Entity
    @AllArgsConstructor

    @Table(name="Student")
    public class Student
    {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        int id;

        String name;

        String branch;

        String email;

        @JsonBackReference
        @ManyToOne
        @JoinColumn(name="university_id",referencedColumnName = "uid")
        University university;



    }

