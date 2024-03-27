/*
Given a string parentheses containing just the characters '(', ')', '{', '}',
 '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Example 1:
Input: parentheses = "()"
Output: true

Example 2:
Input: parentheses = "()[]{}"
Output: true

Example 3:
Input: parentheses = "(]"
Output: false
 */
package com.problem;
//=================================-Imports-==================================
public class ValidParentheses {
    //============================-Variables-=================================
    // Your data structures
    private boolean isValid;
    //===========================-Constructors-===============================
    public ValidParentheses(String parentheses /*Your parameters*/) {
        // Your logic
    }
    //=============================-Methods-==================================

    //----------------------Check-Valid-Parentheses---------------------------
    public boolean checkValidParentheses(String parentheses) {
        // Your logic
        return false;
    }
    //=============================-Getters-==================================
    public boolean getIsValid() {
        // Your logic
        return this.isValid;
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses("([]{})");
        System.out.println(validParentheses.getIsValid());
    }
}
