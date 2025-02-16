package com.coderscampus.a4;

public class Main {

    public static void main(String[] args) {
        // Specify the path to the CSV file
        String csvFilePath = "student-master-list.csv";

        // Create an instance of StudentService with the CSV file path
        StudentService studentService = new StudentService();

        // Process the students
        studentService.processStudents();
    }
}

