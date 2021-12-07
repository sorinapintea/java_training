public class LogicalOperations {

    // 3.
    public int greatestOfTwoNumbers (int firstNumber, int secondNumber){
        if (firstNumber >= secondNumber)
            return firstNumber;
        else
            return secondNumber;
    }

    /* 5. Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    Daca textul primit ca si parametru este egal cu “Evozon”, si numarul primit ca si parametru este mai mic sau egal cu 3,
    returnati textul si numarul, in ordinea asta. Daca textul nu este “Evozon” si numarul este mai mare sau egal cu 4,
    returnati numarul si textul, in ordinea asta.
*/
    public String evozon(String text, int number){
        if (text == "Evozon" && number <= 3)
             return (text + number);
        if (text != "Evozon" && number >= 4)
            return (number + text);
        return ("");
    }

    //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul este mai mare de 8, SAU egal cu 6,
    // atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
    // “The forecast snow is(cm):” si numarul.
    public String snowThisWinter(int number){
        if (number > 8 || number == 6)
            return ("The amount of snow this winter was(cm): " + number);
        else
            return ("The forecast snow is(cm): " + number);
    }


    //7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3,
    // SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4,
    // returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.

    public String compareToThree(int number){
        if (number < 3)
            return ("The number is lower than 3");
        if (number == 4)
            return ("The number is equal to 4");
        if (number == 3)
            return ("");
        return ("The number is greater than 3 and not equal to 4");
    }

    //8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit. Folosind constructia Switch-Case,
    // verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie
    // sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:"
    // cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    public void switchCase (int number){
        switch (number) {
            case 1: System.out.println("The number is: 1"); break;
            case 2: System.out.println("The number is: 2"); break;
            default: System.out.println("The number is not 1 or 2");
        }
    }

    /* 9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si
    sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    Apelati metoda in main() pentru a verifica daca functioneaza.
    * */

    public boolean isNumberEven(int number){
        return (number%2 == 0);
    }

    //10
    public boolean isAbleToVote (int age) {
        if (age >= 18)
            return true;
        return false;
    }


    //11
    public int greatestNumber(int first, int second, int third){
        int greatestNumber;
        if (first >= second) {
            greatestNumber = first;
        }
        else {
            greatestNumber = second;
        }
        if (greatestNumber <= third) {
            greatestNumber = third;
        }

        return greatestNumber;
    }
}
