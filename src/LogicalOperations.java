import java.util.ArrayList;
import java.util.List;

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

//    4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice care
//    dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.(ex: daca
//    int x e primul parametru iar int y  este cel de-al doilea,
//    daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void count(int x, int y){
        int min = x;
        int max = x;
        if (x>y)
            min = y;
        else
            max = y;
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

//Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
//*******
//******
//*****
//****
//***
//
//**
//
//*

    public void printStars (int startNumber){
        for (int i = startNumber; i > 0; i--){
            for (int j= 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    8. Creati o metoda care sa primeasca doi parametri de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
//    Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float mean (int min, int max){
        float sum = 0;
        for (int i = min; i <= max; i++){
            if (i%7 == 0)
                sum += i;
        }
        return sum/(max-min+1);
    }

//    9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void printFibonacci(int number){
        int i = 1;
        int j = 0;
        int k = 2;
        int l = 0;
        while (j < number)
        {
            System.out.println(i);
            l = i + k;
            i = k;
            k = l;
            j++;
        }
    }

//    10. Creati o metoda numita CozaLozaWoza.
//Metoda va afisa:
//- numerele de la 1 la 110
//- 11 numere pe linie
//- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//- se va afisa CozaWoza pentru multiplu de 3 SI 7
//- se va afisa WozaLoza pentru multiplu de 5 SI 7
//- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7

    public void CozaLozaWoza(){
        int i = 1;

        while (i <= 110){
            String stringToPrint = " ";
            if (i%3 == 0)
                stringToPrint = stringToPrint + "Coza";
            if (i%5 == 0)
                stringToPrint = stringToPrint + "Loza";
            if (i%7 == 0)
                stringToPrint = stringToPrint + "Woza";

            if (!stringToPrint.equals(" "))
                System.out.print(stringToPrint);
            else
                System.out.print(" " + i);

            if (i%11 == 0)
                System.out.println();
            i++;
            }
    }

    //test array contains string

    public boolean arrayContainsValue(String text, String[] array){
        for (String i : array) {
            if (i.equals(text))
                return true;
        }
        return false;
    }

    public void printArray(int[] array){
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

//    8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
//    Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
//    Apelati metoda in main() pentru a verifica daca functioneaza.
//
//    public int[] returnArray(int number, int[] array){
//        boolean conatinsElement = false;
//        for (int i : array){
//            if (i == number) {
//                conatinsElement = true;
//                break;
//            }
//        }
//
//        if (conatinsElement) {
//            int[] smallArray = new int[array.length - 1];
//
//            for (int i= 0; i< array.length; i++) {
//                if (array[i] != number)
//                    smallArray[i] = array[i];
//            }
//            return smallArray;
//        }
//        return array;
//    }

//    9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array. Apelati metoda in main() pentru a verifica daca functioneaza.
// tbupdated
public int secondSmallestNumber (int[] array)
{
    int smallNumber = array[0];
    int secondSmallNumber = array[0];
    for (int i :array){
        if (smallNumber < array[i])
        {
            if (secondSmallNumber > array[i])
            secondSmallNumber = array[i];
            smallNumber = array[i];
        }
    }
    return 3;
}

//10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol. Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
// pelati metoda in main() pentru a verifica daca functioneaza.

    //afisati cel mai mare numar dintr=o lista

    public int showBiggestNUmber (List<Integer> list ){
        int highestNumber = list.get(0);
        for (int i: list) {
            if (i>highestNumber)
                highestNumber = i;
        }
        return highestNumber;
    }

    public List<Integer> showEvenNumberFromList(List<Integer> list){
        List<Integer> listEven = new ArrayList<>();
        for (int i : list){
            if (i%2 == 0)
                listEven.add(i);
        }
        return listEven;
    }

//    Scrieti o metoda Java, care sa primeasca parametru o Lista,
//    si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

//    public  List<Integer> reversedList(List<Integer> list){
//        List[] reversed = new List[];
//        reversed.length
//        //for (int i)
//    }
}
