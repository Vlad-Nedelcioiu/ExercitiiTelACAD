/*Să se scrie o instanță de Predicate<Integer> care verifică dacă un număr este prim.
Un număr este prim dacă are doar doi divizori (1 și pe el însuși). Dacă inputul va fi 5, rezultatul va fi true.*/

import java.util.function.Predicate;

public class Exercitiul3 {
    public static void main(String[] args) {
        Predicate<Integer> primeNumber = integer -> {
            for (int i = 2; i <= Math.sqrt(integer); i++) {
                if (integer % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(primeNumber.test(25));
    }
}
