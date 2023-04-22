package com.avinash.fullstack.student.repositiory;

import com.avinash.fullstack.student.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepositiory extends CrudRepository<Student, String> {
}
