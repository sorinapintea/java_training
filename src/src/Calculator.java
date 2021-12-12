public class Calculator {

    // 2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public int sum(int first, int second){
        int result = first + second;
        return result;
    }

    public int substract(int first, int second){
        int result = first - second;
        return result;
    }

    public double multiply(double first, double second){
        double result = first * second;
        return result;
    }

    // 3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.
    public double divide(double first, double second){
        double result = first/second;
        return result;
    }

    // 4. Printati rezultatul urmatoarelor operatiuni:
    public void someOperations() {

        // a. -5 + 8 * 6
        System.out.println(-5 + 8 * 6);

        // b. (55+9) % 9
        System.out.println((55 + 9) % 9);

        // c. 20 + -3*5 / 8
        System.out.println(20 + -3 * 5f / 8);

        // d. 5 + 15 / 3 * 2 - 8 % 3 */
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametri de tip numar, si sa returneze media numerelor.
    public double mean(int firstNumber, int secondNumber, int thirdNumber){
        return (firstNumber + secondNumber + thirdNumber)/3d;
    }

    //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere
    public int modulo(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }

    //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public int toCelsius(int fahrenheitDegrees){
        float celsiusDegreesDecimal = 5f / 9 * (fahrenheitDegrees - 32);
        return Math.round(celsiusDegreesDecimal);
    }

    //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,
    // care sa reprezinte distanta in inch, si sa returneze distanta in metri
    public long toMeters(double inch){
        double metersDecimal = inch * 0.0254;
        long meters = Math.round(metersDecimal);
        return meters;
    }

    /* 9.Scrieti o metoda java, care primeste distanta (in metri) si timpul (ca si 3 numere: ore, minute, secunde),
     si afiseaza viteza, in metri pe secunda, kilometri pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metri)*/
    public void speed(int meters, int hours, int minutes, int seconds){
        int timeInSeconds = seconds + 60 * minutes + 3600 * hours;
        double timeInHours = hours + minutes/60d + seconds/3600d;

        System.out.println("Viteza in metri pe secunda este: " + meters/timeInSeconds);
        System.out.println("Viteza in km pe ora este: " + (meters/1000f)/timeInHours);
        System.out.println("Viteza in mile pe ora este: " + (meters/1609f)/timeInHours);
    }
}
