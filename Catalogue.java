package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
    //constructor
    public Catalogue() {
        Student = new ArrayList<>();
    }
    //state
    public List<Student> Student;

    //behaviour
    public List<Student> getStudents() {
        return Student;
    }
    public Student findStudent(String inputName) {
        Student student;

        for (int i = 0; i < Student.size(); i++) {
            student = (Student) Student.get(i);
            if (inputName.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }
}