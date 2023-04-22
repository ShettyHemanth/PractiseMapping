package com.hemanth.SpringBootMapping.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hemanth.SpringBootMapping.model.University;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto
{
    int usn;

    String name;

    String branch;

    String email;

    @JsonBackReference
    University university;

}
