public class MenuOptions {


    ReadFromKeyboard read = new ReadFromKeyboard();
    Calculator calc = new Calculator();
    LogicalOperations op = new LogicalOperations();

    protected void doSum() {
        System.out.println("Enter the values you want to add: ");
        System.out.println("The sum is: " +
                calc.sum(read.getInt(), read.getInt()));
    }

    protected void doSubstract() {
        System.out.println("Enter the values you want to substract: ");
        System.out.println("The substraction is: " +
                calc.substract(read.getInt(), read.getInt()));
    }

    protected void doPrintStars(){
        System.out.println("EPrinting stars: ");
        op.printStars(5);
    }
}