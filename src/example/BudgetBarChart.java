package example;
//=================================-Imports-==================================
import java.util.HashMap;

public class BudgetBarChart {
    //============================-Variables-=================================
    private HashMap<String, Double> budget;
    //===========================-Constructors-===============================
    public BudgetBarChart() {
        this.budget = new HashMap<>();
    }
    public BudgetBarChart(HashMap<String, Double> budget) {
        this.budget = budget;
    }
    //=============================-Methods-==================================

    //--------------------------Add-Budget-Item-------------------------------
    public void addBudgetItem(String category, double amount) {
        this.budget.put(category, amount);
    }
    //-------------------------Remove-Budget-Item-----------------------------
    public void removeBudgetItem(String category) {
        this.budget.remove(category);
    }
    //-------------------------Update-Budget-Item-----------------------------
    public void updateBudgetItem(String category, double amount) {
        this.budget.put(category, amount);
    }
    //----------------------------Print-Budget--------------------------------
    public void printBudget() {
        final String DIVIDER = "-".repeat(35);
        final String SPACE = " ".repeat(16);
        System.out.println(SPACE + "Budget Bar Chart");
        this.budget.forEach((category, amount) -> {
            System.out.printf("%14s: %s%n",
                              category,
                              this.amountToGraph(amount));
        });
        System.out.println(DIVIDER);
    }
    //--------------------------Amount-To-Graph-------------------------------
    public String amountToGraph(double amount) {
        return "=".repeat((int) amount / 100);
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        BudgetBarChart budget = new BudgetBarChart();
        budget.addBudgetItem("Food", 500);
        budget.addBudgetItem("Rent", 1500);
        budget.addBudgetItem("Transportation", 200);
        budget.printBudget();
        budget.updateBudgetItem("Food", 800);
        budget.printBudget();
        budget.removeBudgetItem("Rent");
        budget.printBudget();
    }
}
