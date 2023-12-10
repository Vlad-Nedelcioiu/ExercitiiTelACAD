import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercitiul4 {
    public static void main(String[] args) {
        IntStream numereNaturale = IntStream.rangeClosed(0,100);
        double media = numereNaturale.average().orElse(0.0);
        System.out.println(media);
    }
}
