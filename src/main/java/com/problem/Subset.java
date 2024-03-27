/*
Given an integer array nums of unique elements, return all possible
subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in
any order.
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */
package com.problem;

//=================================-Imports-==================================
// Your imports here
public class Subset {
    //============================-Variables-=================================
    // Your data structures

    //===========================-Constructors-===============================
    public Subset(int[] nums /*Your parameters*/) {
        // Your logic
    }
    //=============================-Methods-==================================

    //---------------------------Build-Subsets--------------------------------
    // Replace void with the data structure you are using
    public void buildSubsets(int[] nums) {
        // Your logic
    }
    //=============================-Getters-==================================
    // Replace void with the data structure you are using
    public void getSubsets() {
        return; // Return your data structure
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Subset subset = new Subset(nums);
        // Uncomment the following line once you have implemented the
        // solution.
//        System.out.println(subset.getSubsets());
    }
}
