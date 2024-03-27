/*
Write a class that stores equations and their parameters. The class should
return the equation when given the name of the equation.
 */
package com.solution;
//=================================-Imports-==================================
import java.util.HashMap;

public class EquationStorage {
    //============================-Variables-=================================
    private HashMap<String, String> equations;
    //===========================-Constructors-===============================
    public EquationStorage() {
        this.equations = new HashMap<>();
    }
    public EquationStorage(HashMap<String, String> equations) {
        this.equations = equations;
    }
    //=============================-Methods-==================================

    //--------------------------Add-Equation----------------------------------
    public void addEquation(String equationName, String parameters) {
        this.equations.put(equationName, parameters);
    }
    //-------------------------Remove-Equation--------------------------------
    public void removeEquation(String equationName) {
        this.equations.remove(equationName);
    }
    //-------------------------Update-Equation--------------------------------
    public void updateEquation(String equationName, String parameters) {
        this.equations.put(equationName, parameters);
    }
    //--------------------------Get-Equation----------------------------------
    public String getEquation(String equationName) {
        return this.equations.get(equationName);
    }
    //--------------------------Print-Equations-------------------------------
    public void printEquations() {
        final String MAJOR_DIVIDER = "=".repeat(21);
        System.out.println(MAJOR_DIVIDER);
        final String DIVIDER = "-".repeat(21);
        this.equations.forEach((variable, equation) -> {
            System.out.printf("%s%n%s%n%s%n", DIVIDER, variable, equation);
        });
        System.out.println(MAJOR_DIVIDER + "\n");
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        EquationStorage equations = new EquationStorage();
        equations.addEquation("Area of Circle", "pi * r^2");
        equations.addEquation("Area of Rectangle", "length * width");
        equations.addEquation("Area of Triangle", "base * height");
        equations.printEquations();
        equations.removeEquation("Area of Rectangle");
        equations.updateEquation("Area of Triangle", "0.5 * base * height");
        equations.printEquations();
        System.out.println("Area of Circle: " + equations.getEquation("Area of Circle"));
    }
}
