package com.avinash.fullstack.student.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String school;
}
