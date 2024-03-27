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
package com.solution;
//=================================-Imports-==================================
import java.util.Stack;

public class ValidParentheses {
    //============================-Variables-=================================
    private Stack<String> bracketsStacked;
    private boolean isValid;
    //===========================-Constructors-===============================
    public ValidParentheses(String parentheses) {
        this.bracketsStacked = new Stack<>();
        this.isValid = this.checkValidParentheses(parentheses);
    }
    //=============================-Methods-==================================

    //----------------------Check-Valid-Parentheses---------------------------
    public boolean checkValidParentheses(String parentheses) {
        String[] stringBrackets = parentheses.split("");
        for (String bracket : stringBrackets) {
            if (bracket.equals("(") || bracket.equals("{") ||
                                       bracket.equals("[")) {
                this.bracketsStacked.push(bracket);
            } else {
                if (this.bracketsStacked.isEmpty()) {
                    return false;
                }
                String storedBracket = this.bracketsStacked.pop();
                if (bracket.equals(")") && !storedBracket.equals("(")) {
                    return false;
                }
                if (bracket.equals("}") && !storedBracket.equals("{")) {
                    return false;
                }
                if (bracket.equals("]") && !storedBracket.equals("[")) {
                    return false;
                }
            }
        }
        return this.bracketsStacked.isEmpty();
    }
    //=============================-Getters-==================================
    public boolean getIsValid() {
        return this.isValid;
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses("([]{})");
        System.out.println(validParentheses.getIsValid());
    }
}
