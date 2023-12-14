import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiul8 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        System.out.println("Care este numele tau?");
        String name = bufferedReader.readLine();
        System.out.println("Salut, " + name + " !");

    }
}
