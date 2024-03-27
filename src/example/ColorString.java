package example;
//=================================-Imports-==================================
import java.util.ArrayList;

public class ColorString {
    //============================-Variables-=================================
    String coloredString;
    //============================-Constants-=================================
    public static final ArrayList<String> SUPPORTED_COLORS = new ArrayList<>();
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    //==========================-Static-Actions-==============================
    static {
        SUPPORTED_COLORS.add(BLACK);
        SUPPORTED_COLORS.add(RED);
        SUPPORTED_COLORS.add(GREEN);
        SUPPORTED_COLORS.add(YELLOW);
        SUPPORTED_COLORS.add(BLUE);
        SUPPORTED_COLORS.add(PURPLE);
        SUPPORTED_COLORS.add(CYAN);
        SUPPORTED_COLORS.add(WHITE);
    }
    //===========================-Constructors-===============================
    public ColorString(String color, String text) {
        this.coloredString = buildColorString(color, text);
    }
    //=============================-Methods-==================================

    //-------------------------Build-Color-String-----------------------------
    public String buildColorString(String color, String text) {
        if (!SUPPORTED_COLORS.contains(color)) {
            throw new ColorNotSupportedException();
        }
        return color + text + RESET;
    }
    //=============================-Getters-==================================
    public String getColoredString() {
        return this.coloredString;
    }
    //===============================-Main-===================================
    public static void main(String[] args) {
        ArrayList<ColorString> colorStrings = new ArrayList<>();
        colorStrings.add(new ColorString(ColorString.RED, "Red"));
        colorStrings.add(new ColorString(ColorString.GREEN, "Green"));
        colorStrings.add(new ColorString(ColorString.YELLOW, "Yellow"));
        colorStrings.add(new ColorString(ColorString.BLUE, "Blue"));
        colorStrings.add(new ColorString(ColorString.PURPLE, "Purple"));
        colorStrings.add(new ColorString(ColorString.CYAN, "Cyan"));
        colorStrings.add(new ColorString(ColorString.WHITE, "White"));
        colorStrings.add(new ColorString(ColorString.BLACK, "Black"));
        colorStrings.forEach(colorString -> {
            System.out.println(colorString.getColoredString());
        });
    }
}
