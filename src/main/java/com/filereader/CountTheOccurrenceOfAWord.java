package com.filereader;
//Import the required packages
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Create a class to calculate the frequency of a target qord
public class CountTheOccurrenceOfAWord {
    public static void main(String[] args) {
        //Create variables to store the sentence, file path, target string and the count.
        String line = "";
        String fileName = "D:\\Training_Capgemini\\Week3\\Day4\\filereader\\demo.txt";
        String target = "reader";
        int count = 0;

        //Using try and catch block to handle the file not found exception and print message
        try{
            //Create and file reader and pass fileName then create a bufferReader to read the file reader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = bufferedReader.readLine();
            //Store the lines of file and run a loop to find the frequency of target
            while(line != null){
                String[] array = line.split(" ");
                for(String str:array){
                    if(str.contains(target)){
                        count++;
                    }
                }
                //Change to next line
                line = bufferedReader.readLine();
            }

            //Print the count of target string while closing the fileReader
            System.out.println("The count of " + target + " is: " + count);
            fileReader.close();
            bufferedReader.close();
        }
        //Catch the exception if any happens to resume the execution of remaining code
        catch (IOException e){
            System.out.println("Exception occurred when trying to count the target word.");
        }
    }
}
