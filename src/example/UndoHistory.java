package example;
//=================================-Imports-==================================
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class UndoHistory {
    //============================-Variables-=================================
    private Stack<String> undoStack;
    //===========================-Constructors-===============================
    public UndoHistory() {
        this.undoStack = new Stack<>();
    }
    public UndoHistory(Stack<String> undoStack) {
        this.undoStack = undoStack;
    }
    //=============================-Methods-==================================

    //-----------------------------Add-Action---------------------------------
    public void addAction(String action) {
        this.undoStack.push(action);
    }
    //-----------------------------Undo-Action--------------------------------
    public void undoAction() {
        if (!this.undoStack.isEmpty()) {
            String undoAction = this.undoStack.pop();
            System.out.printf("Undo: %s%n", undoAction);
        } else {
            System.out.println("Nothing to undo.");
        }
    }
    //---------------------------Print-History--------------------------------
    public void printHistory() {
        final String MAJOR_DIVIDER = "=".repeat(30);
        final String DIVIDER = "-".repeat(30);
        System.out.println(MAJOR_DIVIDER);
        int stackSize = this.undoStack.size();
        AtomicInteger stackCounter = new AtomicInteger(stackSize);
        this.undoStack.forEach(action -> {
            System.out.printf("%s%n%d. %s%n", DIVIDER, stackCounter.get(), action);
            stackCounter.set(stackCounter.get() - 1);
        });
        System.out.println(MAJOR_DIVIDER + "\n");
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        UndoHistory undoHistory = new UndoHistory();
        undoHistory.addAction("Type: Oh Hi Mark.");
        undoHistory.addAction("Delete: Oh Hi Mark.");
        undoHistory.addAction("Type: The Room.");
        undoHistory.printHistory();
        undoHistory.undoAction();
        undoHistory.undoAction();
        undoHistory.printHistory();
    }
}
