package com.stringbuffer;
// Create a class ConcatenateString to add new strings to a StringBuffer
public class ConcatenateString {
    public static void main(String[] args) {
        // Create a sample array of strings and pass it to the function for concatenation
        String[] array = {"You", "can", "do", "it", "!"};
        String result = concatenate(array);

        // Print the final concatenated string
        System.out.println("The concatenated string is: \n"+result);
    }

    //Create a method to perform concatenation of a string array to a single string
    private static String concatenate(String[] array) {
        // Create a StringBuffer object to store the concatenated string
        StringBuffer str = new StringBuffer();

        // Loop through each element of the array and append it to the StringBuffer
        for (String s : array) {
            str.append(s).append(" ");
        }

        //Return the resultant string after converting it to string
        return str.toString();
    }
}
