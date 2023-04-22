package com.avinash.fullstack.student.controller;

import com.avinash.fullstack.student.service.StudentService;
import com.avinash.fullstack.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.findAllStudent();
    }
    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable String id){
        return studentService.findStudentById(id);

    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable String id, @RequestBody Student student){
        return studentService.updateStudent(id, student);
    }
    @DeleteMapping("/students/{id}")
    public void addStudent(@PathVariable String id){
        studentService.deleteStudent(id);

    }
}
