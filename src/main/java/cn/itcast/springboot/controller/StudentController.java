package cn.itcast.springboot.controller;

import cn.itcast.springboot.entity.Student;
import cn.itcast.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController

@RequestMapping("students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @DeleteMapping(value = "/{id}")
    public Collection<Student> deleteStudentById(@PathVariable("id") Long id){

        return studentService.deleteStudentById(id);
    }
}
