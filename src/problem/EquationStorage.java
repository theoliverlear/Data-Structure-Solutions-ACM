/*
Write a class that stores equations and their parameters. The class should
return the equation when given the name of the equation.
 */
package problem;
//=================================-Imports-==================================
// Your imports here
public class EquationStorage {
    //============================-Variables-=================================
    // Your data structures
    //===========================-Constructors-===============================
    public EquationStorage(/* Your parameters */) {
        // Your logic
    }
    //=============================-Methods-==================================

    //--------------------------Add-Equation----------------------------------
    public void addEquation(String equationName, String parameters) {
        // Your logic
    }
    //-------------------------Remove-Equation--------------------------------
    public void removeEquation(String equationName) {
        // Your logic
    }
    //-------------------------Update-Equation--------------------------------
    public String getEquation(String equationName) {
        // Your logic
        return "";
    }
    //-------------------------Update-Equation--------------------------------
    public void updateEquation(String equationName, String parameters) {
        // Your logic
    }
    //--------------------------Print-Equations-------------------------------
    public void printEquations() {
        // Your logic
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
