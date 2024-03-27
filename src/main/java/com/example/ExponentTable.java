package com.example;
//=================================-Imports-==================================
import java.util.ArrayList;

public class ExponentTable {
    //============================-Variables-=================================
    private int numberLimit;
    private int exponentLimit;
    ArrayList<ArrayList<Integer>> squares;
    //===========================-Constructors-===============================
    public ExponentTable(int numberLimit, int exponentLimit) {
        this.numberLimit = numberLimit;
        this.exponentLimit = exponentLimit;
        this.squares = this.buildTable(numberLimit, exponentLimit);
    }
    //=============================-Methods-==================================

    //----------------------------Build-Table---------------------------------
    public ArrayList<ArrayList<Integer>> buildTable(int numberLimit, int exponentLimit) {
        ArrayList<ArrayList<Integer>> squares = new ArrayList<>();
        for (int currentNum = 1; currentNum <= numberLimit; currentNum++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int numExponent = 1; numExponent <= exponentLimit; numExponent++) {
                row.add((int) Math.pow(currentNum, numExponent));
            }
            squares.add(row);
        }
        return squares;
    }
    //----------------------------Print-Table---------------------------------
    public void printTable() {
        final String MAJOR_DIVIDER = "=".repeat(21);
        System.out.println(MAJOR_DIVIDER);
        final String DIVIDER = "-".repeat(21);
        this.squares.forEach(square -> {
            System.out.printf("%s%n%s%n", DIVIDER, square);
        });
        System.out.println(MAJOR_DIVIDER + "\n");
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        ExponentTable exponentTable = new ExponentTable(5, 5);
        exponentTable.printTable();
    }
}
