package com.hemanth.SpringBootMapping.MapperClass;

import com.hemanth.SpringBootMapping.dto.StudentDto;
import com.hemanth.SpringBootMapping.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper
{


    public static Student dtoToStudentMapping(StudentDto studentDto)
    {
        Student s=new Student();
        s.setName(studentDto.getName());
        s.setId(studentDto.getUsn());
        s.setBranch(studentDto.getBranch());
        s.setEmail(studentDto.getEmail());
        s.setUniversity(studentDto.getUniversity());


        return  s;
    }

    public static StudentDto studentToDto(Student student)
    {
        StudentDto s=new StudentDto();
        s.setName(student.getName());
        s.setBranch(student.getBranch());
        s.setUsn(student.getId());
        s.setEmail(student.getEmail());
        s.setUniversity(student.getUniversity());



        return s;
    }
}
