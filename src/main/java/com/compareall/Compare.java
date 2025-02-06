package com.compareall;

import java.io.*;

public class Compare {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        String str = "Hello";

        // Measuring performance of StringBuffer 
        StringBuffer buffer = new StringBuffer(str);
        // Record start time and Append string repeatedly
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            buffer.append(" and welcome");
        }
        // Record end time and print the time taken
        endTime = System.nanoTime();
        System.out.println("Total time taken by StringBuffer is: " + (endTime - startTime));

        // Measuring performance of StringBuilder 
        StringBuilder builder = new StringBuilder(str);
        // Record start time and Append string repeatedly
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            builder.append(" and welcome");
        }
        // Record end time and print time taken
        endTime = System.nanoTime();
        System.out.println("Total time taken by StringBuilder is: " + (endTime - startTime));

        System.out.println("===============================================================");

        // File path of the text file to be read
        String fileName = "D:\\Training_Capgemini\\Week3\\Day4\\src\\main\\java\\com\\compareall\\demo.txt";
        String line = "";
        int count = 0;
        // Start timing for FileReader
        startTime = System.nanoTime();

        // Reading file using FileReader (Character-based reading)
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            // Split line into words using space as a delimiter and count each word
            while (line != null) {
                String[] arr = line.split(" ");
                for (String val : arr) {
                    count++;
                }
                line = bufferedReader.readLine();
            }

            // End timing for FileReader
            endTime = System.nanoTime();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace(); // Print error if file reading fails
        }

        System.out.println("Word count of FileReader: " + count);
        System.out.println("Time taken by FileReader: " + (endTime - startTime));

        line = "";
        count = 0;
        // Start timing for InputStreamReader
        startTime = System.nanoTime();

        // Reading file using FileInputStream and InputStreamReader (Byte-based reading with character conversion)
        try {
            FileInputStream inputStream = new FileInputStream(fileName);
            InputStreamReader streamReader = new InputStreamReader(inputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(streamReader);
            line = bufferedReader.readLine();

            // Split line into words using space as a delimiter and count the words
            while (line != null) {
                String[] arr = line.split(" ");
                for (String val : arr) {
                    count++;
                }
                line = bufferedReader.readLine();
            }

            // End timing for InputStreamReader
            endTime = System.nanoTime();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace(); // Print error if file reading fails
        }

        //Print the time taken
        System.out.println("Word count of InputStreamReader: " + count);
        System.out.println("Time taken by InputStreamReader: " + (endTime - startTime));
    }
}
