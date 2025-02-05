package com.inputstreamreader;
//Import the required packages
import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        // Define the file path where input will be saved
        String file = "D:\\Training_Capgemini\\Week3\\Day4\\inputstreamreader\\writedemo2.txt";
        try {
            // Create an InputStreamReader to read input from the console
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(reader);

            // Open the file in append mode
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            System.out.println("Enter the text line by line or type 'exit' to exit the file");

            String inputLine;
            while (true) {
                // Read user input
                inputLine = br.readLine();

                // Check for exit condition
                if (inputLine.equals("exit")) {
                    System.out.println("Exiting the file");
                    break;
                }
                // Write input to file
                bufferedWriter.write(inputLine);

                // Add a new line
                bufferedWriter.newLine();

                // Ensure data is written to the file
                bufferedWriter.flush();
            }

            System.out.println("File is saved");

        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }
    }
}
