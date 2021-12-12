public class ProgramLogic {

    ReadFromKeyboard read = new ReadFromKeyboard();
    ProgramMenu menu = new ProgramMenu();
    MenuOptions options = new MenuOptions();

    public void runSpecificProgram(String program) {
        boolean repeat;
        do {
            menu.printProgramMenu(program);
            repeat = chooseProgramOption(program, read.getInt());
        } while (repeat);
    }

    public boolean chooseProgramOption(String program, int option) {
        switch (program) {
            case "main":
                return chooseMainOption(option);
            case "calculator":
                return chooseCalculatorOption(option);
            case "logical operations":
                return chooseLogicalOperationsOption(option);
        }
        return false;
    }

    private boolean chooseMainOption(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                runSpecificProgram("calculator");
                return true;
            case 2:
                runSpecificProgram("logical operations");
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

    private boolean chooseCalculatorOption(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                options.doSum();
                return true;
            case 2:
                options.doSubstract();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;
        }
    }

    private boolean chooseLogicalOperationsOption(int number) {
        switch (number) {
            case 0:
                System.out.println("Bye bye");
                return false;
            case 1:
                options.doSum();
                return true;
            case 2:
                options.doPrintStars();
                return true;
            default:
                System.out.println(Messages.INCORECT_VALUE_MESSAGE);
                return true;

        }
    }
}