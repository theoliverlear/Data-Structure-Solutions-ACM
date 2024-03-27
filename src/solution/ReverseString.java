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
package solution;
//=================================-Imports-==================================
import java.util.Stack;

public class ReverseString {
    //============================-Variables-=================================
    private String reversedString;
    private Stack<String> stringStacked;
    //===========================-Constructors-===============================
    public ReverseString(String stringToReverse) {
        this.stringStacked = new Stack<>();
        this.reversedString = this.buildReversedString(stringToReverse);
    }
    //=============================-Methods-==================================

    //-----------------------Build-Reversed-String----------------------------
    public String buildReversedString(String stringToReverse) {
        String[] stringLetters = stringToReverse.split("");
        for (String character : stringLetters) {
            this.stringStacked.push(character);
        }
        StringBuilder reversedStringBuilder = new StringBuilder();
        while (!this.stringStacked.isEmpty()) {
            reversedStringBuilder.append(this.stringStacked.pop());
        }
        return reversedStringBuilder.toString();
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
