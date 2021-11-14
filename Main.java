package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //instanserar Catalogue class
        Catalogue catalogue = new Catalogue();

        //creates local path and saves in variable "path"
        String path = "src/com/company/RecordBook.txt";

        //program is written within the try catch where im using scanner and calling on my path
        try (Scanner sc = new Scanner(new File(path))) {
            String st;
            while (sc.hasNextLine()) {
                st = sc.nextLine();
                //stores textfile input in arrays using split
                var arr = st.split(":");
                var nur = arr[1].split(",");

                //temporarily storing numbers and changing them to ints using for each loop
                List<Integer> temp = new ArrayList<>();
                for (var n : nur) {
                    temp.add(Integer.parseInt(n));
                }
                catalogue.Student.add(new Student(arr[0], new Book(temp)));
            }

            //printing out students
            for (var s : catalogue.getStudents()) {
                System.out.println("Student name: " + s.getName());
            }
            //asking for user input with scanner and saves input in variable "inputName"
            System.out.println("----------------------");
            System.out.println("Enter student name to get grades");
            Scanner scan = new Scanner(System.in);
            String inputName = scan.nextLine();

            //checking if user input is a valid argument and executes code depending on input
            Student currentStudent = catalogue.findStudent(inputName);

            if (currentStudent == null) {
                System.out.println("Can't find Student");
            } else {
                System.out.println("Student name: " + currentStudent.getName());
                System.out.println("Student grades: " + currentStudent.getBook().getStudentGrades());
                System.out.println("Highest grade: " + currentStudent.getBook().HighestGrade());
                System.out.println("Lowest grade: " + currentStudent.getBook().LowestGrade());
                System.out.println(("Average grade: " + currentStudent.getBook().AverageGrade()));
            }

        } catch (IOException e) {
            System.err.println("error reading students from file ");
            e.printStackTrace();
        }

    }
}