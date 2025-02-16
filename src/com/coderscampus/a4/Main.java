package com.coderscampus.a4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
        // Create an instance of StudentService to read and process the CSV
        new StudentService();
    }

    // Method to read a CSV file
    private static void printCsvFile(String csvFile) {  
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = reader.readLine()) != null) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


	}

