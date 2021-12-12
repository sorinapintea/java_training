import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {


    public int getInt() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        boolean condition = false;
        do {
            try {
                x = scanner.nextInt();
                condition = true;
            } catch (InputMismatchException e) {
                System.err.println("valoarea introdusa '" + scanner.nextLine() + "'  nu e correcta ");
//                System.err.println("Incorrect value.");
            }
        } while (!condition);
        return x;
    }


    public int[] getArray() {
        System.out.print("Enter array length: ");
        int[] arr = new int[getInt()];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value for position " + i + ":");
            arr[i] = getInt();
        }
        return arr;
    }

    public List<Integer> getList() {
        List<Integer> myList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list values, type exit for end:");
        do {
            try {
                int value = scan.nextInt();
                myList.add(value);
            } catch (InputMismatchException e) {
                if (scan.nextLine().equals("exit"))
                    return myList;
                System.err.println("Incorrect value, try again.");
            }
        } while (true);
    }

    public String getString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


}