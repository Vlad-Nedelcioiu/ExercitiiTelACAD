/*
Folosind streamuri primitive, să se calculeze media primelor 100 numere naturale.
*/

import java.util.stream.IntStream;

public class Exercitiul4 {
    public static void main(String[] args) {
        IntStream numereNaturale = IntStream.rangeClosed(0,100);
        double media = numereNaturale.average().orElse(0.0);
        System.out.println(media);
    }
}
