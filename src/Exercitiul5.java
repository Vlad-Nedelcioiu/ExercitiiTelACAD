//Suma numerelor din stream
import java.util.stream.Stream;

public class Exercitiul5 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("1","2","3");
        int sum = stringStream.mapToInt(num -> Integer.parseInt(num)).sum();
                            //.mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}
