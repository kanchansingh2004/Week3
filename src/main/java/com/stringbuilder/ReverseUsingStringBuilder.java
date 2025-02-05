package com.stringbuilder;
//Create a ReverseUsingStringBuilder class to reverse the string using string builder
public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        //Create a string variable word to store the string
        String word = "Blimey!";

        //Print the original word and the reversed word stored in result variable
        System.out.println("Original string: " + word);
        String result = reverseString(word);
        System.out.println("Reversed string: " + result);
    }

    //Create a method to reverse a string using String builder
    public static String reverseString(String word){
        //Create a string builder object and pass the word
        StringBuilder str = new StringBuilder(word);
        //Reverse the string and return to main method
        str.reverse();
        return str.toString();
    }
}
