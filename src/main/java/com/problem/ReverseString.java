/*
Write a function that reverses a string. The input string is given as an array
of characters s.

Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Example 2:
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */
package com.problem;
//=================================-Imports-==================================
// Your imports here
public class ReverseString {
    //============================-Variables-=================================
    // Your data structures
    private String reversedString;
    //===========================-Constructors-===============================
    public ReverseString(String stringToReverse /*Your parameters*/) {
        // Your logic
    }
    //=============================-Methods-==================================

    //----------------------Build-Reversed-String-----------------------------
    public String buildReversedString(String stringToReverse) {
        // Your logic
        return "";
    }
    //=============================-Getters-==================================
    public String getReversedString() {
        return this.reversedString;
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString("Hello, World!");
        System.out.println(reverseString.getReversedString());
    }
}
