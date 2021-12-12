import java.util.ArrayList;
import java.util.List;

public class ProgramMenu {


    public void printMenu() {
        System.out.println("Hello!");
        System.out.println("Choose an option:");
        List<String> menuList = new ArrayList<>();
        menuList.add("Calculator");
        menuList.add("Logical Operations");
        menuList.add("Get Celsius temperature from Fahrenheit");
        menuList.add("Print stars");

        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + " - " + menuList.get(i));
        }
        System.out.println("0 - Exit");
    }

    public void printCalculatorMenu() {
        System.out.println("Choose an option:");
        List<String> menuList = new ArrayList<>();
        menuList.add("Sum");
        menuList.add("Substract");

        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + " - " + menuList.get(i));
        }
        System.out.println("0 - Return to main menu");
    }

    public void printLogicalOperationsMenu() {
        System.out.println("Choose an option:");
        List<String> menuList = new ArrayList<>();
        menuList.add("Get Celsius temperature from Fahrenheit");
        menuList.add("Print stars");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println((i + 1) + " - " + menuList.get(i));
        }
        System.out.println("0 - Return to main menu");
    }

    public void printProgramMenu(String program) {
        switch (program) {
            case "main":
                printMenu();
                break;
            case "calculator":
                printCalculatorMenu();
                break;
            case "logical operations":
                printLogicalOperationsMenu();
                break;
        }
    }

}