import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        printMyName();

//        Calculator calculator = new Calculator();
//
//        System.out.println("Rezultatul adunarii este: " + calculator.sum(2,3));
//        System.out.println("Rezultatul scaderii este: " + calculator.substract(2,3));
//        System.out.println("Rezultatul inmultirii este: " + calculator.multiply(2,3));
//        System.out.println("Rezultatul impartirii este: " + calculator.divide(2,3));
//
//        calculator.someOperations();
//
//        System.out.println("Media este: " + calculator.mean(1, 2, 4));
//        System.out.println("Restul este: " + calculator.modulo(6,4));
//        System.out.println("Temperatura in Celsius este: " + calculator.toCelsius(89));
//        System.out.println("Distanta in metri este: " + calculator.toMeters(89));
//        calculator.speed(3000, 1, 30, 0);
//
        LogicalOperations op = new LogicalOperations();
//
//        System.out.println(op.compareToThree(7));
//        System.out.println(op.snowThisWinter(6));
//        System.out.println(op.evozon("8", 7));
//
//        System.out.println(op.isNumberEven(4));
//        System.out.println(op.isAbleToVote(17));
//        System.out.println(op.greatestNumber(3,2,1));

       // op.printStars(7);
        op.count(13,2);
//        op.printFibonacci(20);
//        op.CozaLozaWoza();

        System.out.println(op.arrayContainsValue("aa", new String[]{"bb", "aa"}));
        op.printArray(new int[]{1, 2});
      //  op.printArray(op.returnArray(2,  new int[]{1, 2, 3}));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);

        System.out.println(op.showBiggestNUmber(list));
        System.out.println(op.showEvenNumberFromList(list));
    }

    // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void printMyName(){
        System.out.println("Hello" + "\n" + "Sorina");
    }
}
