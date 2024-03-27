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
package com.solution;
//=================================-Imports-==================================
import java.util.ArrayList;

public class Subset {
    //============================-Variables-=================================
    private ArrayList<ArrayList<Integer>> subsets;
    //===========================-Constructors-===============================
    public Subset(int[] nums) {
        this.subsets = this.buildSubsets(nums);
    }
    //=============================-Methods-==================================

    //---------------------------Build-Subsets--------------------------------
    public ArrayList<ArrayList<Integer>> buildSubsets(int[] nums) {
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<>());
        for (int num : nums) {
            int subsetsSize = subsets.size();
            for (int i = 0; i < subsetsSize; i++) {
                ArrayList<Integer> subset = new ArrayList<>(subsets.get(i));
                subset.add(num);
                subsets.add(subset);
            }
        }
        return subsets;
    }
    //=============================-Getters-==================================
    public ArrayList<ArrayList<Integer>> getSubsets() {
        return this.subsets;
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Subset subset = new Subset(nums);
        System.out.println(subset.getSubsets());
    }
}
