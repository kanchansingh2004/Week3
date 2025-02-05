package com.inputstreamreader;
//Import required packages
import java.io.*;
//Create a ByteStreamToCharacterStream to read binary data from a file and print it as characters
public class ByteStreamToCharacterStream {
    public static void main(String[] args) {
        //String variable to store the file path and a vairbale to store the buffer line
        String str = "D:\\Training_Capgemini\\Week3\\Day4\\src\\main\\java\\com\\inputstreamreader\\download.jpg";
        String line = "";

        //Using try and catch block to handle the file not found exception and print message
        try {
            //Create a FileInputStream and pass string str then create a InputStreamReader to convert the byte stream into a character stream.
            FileInputStream input = new FileInputStream(str);
            InputStreamReader inputReader = new InputStreamReader(input, "UTF-8");
            //Pass the inputReader to read it line by line
            BufferedReader bufferedReader = new BufferedReader(inputReader);
            line = bufferedReader.readLine();
            //Run loop till no line is left to read
            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }
        //Catch the exception if any happens to resume the execution of remaining code
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
