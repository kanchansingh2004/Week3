package com.filereader;
//Import the required packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Create a ReadUsingFileReader class to read a file line by line
public class ReadUsingFileReader {
    public static void main(String[] args) {
        //String variable to store the file path
        String fileName = "D:\\Training_Capgemini\\Week3\\Day4\\filereader\\demo.txt";
        //Varibale to store the buffer line
        String line = "";

        //Using try and catch block to handle the file not found exception and print message
        try{
            //Create and file reader and pass fileName then create a bufferReader to read the file reader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Store the lines of file and run a loop to print each line
            line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
            fileReader.close(); //Close the opened file
            bufferedReader.close(); //Close the opened buffer reader
        }
        //Catch the exception if any happens to resume the execution of remaining code
        catch (IOException e){
            System.out.println("Exception occurred, when tried to read the file.");
        }
    }
}
