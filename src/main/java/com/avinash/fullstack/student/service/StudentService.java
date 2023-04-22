package com.avinash.fullstack.student.service;

import com.avinash.fullstack.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    List<Student> studentList= new ArrayList<>(Arrays.asList(new Student("1","Avinash","Kumar","AVHS")));
    public List<Student> findAllStudent() {
        return studentList;
    }

    public Optional<Student> findStudentById(String id) {
        return studentList.stream().filter(student->student.getId().equals(id)).findFirst();

    }

    public Student addStudent(Student student) {
        studentList.add(student);
        return  student;
    }

    public Student updateStudent(String id, Student student) {
        for(Student s:studentList){
            if(s.getId().equals(id)){
                s.setFirstName(student.getFirstName());
                s.setLastName(student.getLastName());
                s.setSchool(student.getSchool());
                break;
            }
        }
        return student;
    }

    public void deleteStudent(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }
}
