package com.stringbuilder;
//Import the HashSet Library to store the unique elements
import java.util.HashSet;
//Create a RemoveDuplicates class to remove the duplicates from the string using hashset and string builder
public class RemoveDuplicates {
    public static void main(String[] args) {
        //Create a sample string variable
        String str = "helloo";

        //Method call to removeDuplicates, returning string with unique characters
        String resultString = removeDuplicates(str);

        //Print original and modified string
        System.out.println("Original string: " + str);
        System.out.println("String after duplicates removal: "+resultString);
    }

    //Create a method to perform removal of duplicates from a string using string builder
    public static String removeDuplicates(String str) {
        //Create a string builder to use its functionality to create a new string
        StringBuilder resultString = new StringBuilder();
        //Create a HashSet to store unique characters
        HashSet <Character> set = new HashSet<Character>();

        //Run a loop to append the elements in string only if they are not present in HashSet
        for(int i = 0 ; i < str.length() ; i ++ ){
            if(set.contains(str.charAt(i))){
                continue;
            }
            else{
                set.add(str.charAt(i));
                resultString.append(str.charAt(i));
            }
        }

        //Return the resultant string after converting it to string
        return resultString.toString();
    }


}
