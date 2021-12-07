import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {

        printMyName();

        Calculator calculator = new Calculator();

        System.out.println("Rezultatul adunarii este: " + calculator.sum(2,3));
        System.out.println("Rezultatul scaderii este: " + calculator.substract(2,3));
        System.out.println("Rezultatul inmultirii este: " + calculator.multiply(2,3));
        System.out.println("Rezultatul impartirii este: " + calculator.divide(2,3));

        calculator.someOperations();

        System.out.println("Media este: " + calculator.mean(1, 2, 4));
        System.out.println("Restul este: " + calculator.modulo(6,4));
        System.out.println("Temperatura in Celsius este: " + calculator.toCelsius(89));
        System.out.println("Distanta in metri este: " + calculator.toMeters(89));
        calculator.speed(3000, 1, 30, 0);

        LogicalOperations op = new LogicalOperations();

        System.out.println(op.compareToThree(7));
        System.out.println(op.snowThisWinter(6));
        System.out.println(op.evozon("8", 7));

        System.out.println(op.isNumberEven(4));
        System.out.println(op.isAbleToVote(17));
        System.out.println(op.greatestNumber(3,2,1));
    }

    // 1. Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
    public static void printMyName(){
        System.out.println("Hello" + "\n" + "Sorina");
    }
}
