/*Să se scrie o instanță de Function<String, Integer> care ia ca parametru un String ce reprezintă un număr și întoarce pătratul acestuia.
De exemplu, inputul va fi "9", iar rezultatul va fi 81. */

import java.util.Scanner;
import java.util.function.Function;

public class Exercitiul2 {
    public static void main(String[] args) {

        Function<String, Integer> squaredNumber = e -> {
            int number = Integer.parseInt(e);
            return number*number;
        };

        int rezultat = squaredNumber.apply(new Scanner(System.in).nextLine());
        System.out.println("Rezultat: " + rezultat);
        }
    }
