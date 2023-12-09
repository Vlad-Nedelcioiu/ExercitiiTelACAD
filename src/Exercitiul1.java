/*Să se instanțieze, folosind expresii lambda, un obiect de tip Supplier<Integer>
care produce un număr între 0 și anul vostru de naștere.*/

import java.util.Random;
import java.util.function.Supplier;

public class Exercitiul1 {
    public static void main(String[] args) {

        int birthYear = 2001;
        Supplier<Integer> randomInt = () -> new Random().nextInt(birthYear);

        System.out.println("Numar generat: " + randomInt.get());
    }
}