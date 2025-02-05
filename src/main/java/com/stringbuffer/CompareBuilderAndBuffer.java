package com.stringbuffer;
// Create a class Compare to compare the timing of StringBuilder and StringBuffer
public class CompareBuilderAndBuffer {
    public static void main(String[] args) {
        //Create variables to store the start and end time of StringBuilder and StringBuffer
        long startTime, endTime;

        // Testing StringBuffer using for loop appending 1 million string
        startTime = System.nanoTime();
        StringBuffer str1 = new StringBuffer("Hello");
        for (int i = 0; i < 100000; i++) {
            str1.append(" checking the String");
        }
        //Store the end time and print the time taken
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // Testing StringBuilder using for loop appending 1 million string
        startTime = System.nanoTime();
        StringBuilder str2 = new StringBuilder("Hello");
        for (int i = 0; i < 100000; i++) {
            str2.append(" checking the String");
        }
        //Store the end time and print the time taken
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
