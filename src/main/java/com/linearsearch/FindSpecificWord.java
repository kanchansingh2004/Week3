package com.linearsearch;
//Create a FindSpecificWord class to find the sentence with a specific word
public class FindSpecificWord {
    public static void main(String[] args) {
        //String array to store the strings
        String[] array = {"Hello everyone", "Hello everyone, how are you?", "Hello everyone, wassup?"};
        //Create variable to provide the word
        String word = "was";

        //Call the findSpecificWord method and store in a string
        String result = findSpecificWord(array, word);

        //Check whether there exist any sentence in string array or not
        if(result == null){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The first sentence containing '" + word + "' is: " + result);
        }
    }

    //Method to find the first sentence with provided specific word
    public static String findSpecificWord(String[] array, String word) {
        //Run a for each loop through array
        for (String str : array) {
            if (str.contains(word)) {
                //Return the string with the word
                return str;
            }
        }
        //Return null if not such sentence exist
        return null;
    }
}

