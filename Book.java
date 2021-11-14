package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    //state
    private List<Integer> grades;

    //constructor (tar in en lista)
    public Book(List<Integer> grades) {
        this.grades = grades;
    }

    //behaviour
    /*
    public void setgrade(List<Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
     */
    public List<Integer> getStudentGrades() {
        return grades;
    }

    //kollar i listan vilken int som är högst och presenterar den
    public int HighestGrade() {
        Collections.sort(grades);
        var listSize = grades.size();
        var lastElement = listSize - 1;
        return grades.get(lastElement);
    }
    //kollar i listan vilken int som är lägst och presenterar den
    public int LowestGrade() {
        Collections.sort(grades);
        return grades.get(0);
    }
    //kollar alla ints i listan och sparar genomsnittsvärdet i "average" variabeln och returnerar den
    public int AverageGrade() {
        int total = 0;
        for (var g : grades) {
            total = total + g;
        }
        var average = total / grades.size();
        return average;
    }
}