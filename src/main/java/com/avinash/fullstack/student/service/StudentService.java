package com.avinash.fullstack.student.service;

import com.avinash.fullstack.student.model.Student;
import com.avinash.fullstack.student.repositiory.StudentRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepositiory studentRepositiory;

    public List<Student> findAllStudent() {
        List<Student> studentList = new ArrayList<>();
         studentRepositiory.findAll().forEach(studentList::add);
         return studentList;
    }

    public Optional<Student> findStudentById(String id) {
        return studentRepositiory.findById(id);
    }

    public Student addStudent(Student student) {
        return studentRepositiory.save(student);
    }

    public Student updateStudent(String id, Student student) {
        return studentRepositiory.save(student);
    }

    public void deleteStudent(String id) {
        studentRepositiory.deleteById(id);
    }
}
