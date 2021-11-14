package com.company;

import java.util.List;

public class Student {

    //state
    private String name;
    public Book book;

    //constructor
    //ifall man vill använda student men inte kräva betyg därav används ej
    public Student(String name) {
        this.name = name;
    }

    //constructor som tar in namn och betyg
    public Student(String name, Book book){
        this.name = name;
        this.book = book;
    }

    //behaviour (getters)
    public String getName() {
        return name;
    }
    public Book getBook() {
        return book;
    }


    //kodade med denna på lektionen men används inte, ville ändå spara den
    /*
    public String GenerateStatistics(){
        var hG =book.HighestGrade();
        var lG = book.LowestGrade();
        var aG = book.AverageGrade();
        return "Highest Grade: " + hG + "\n" +
                "Lowest Grade: " + lG + "\n" +
                "Average Grade: " + aG + "\n";
    }
     */


}