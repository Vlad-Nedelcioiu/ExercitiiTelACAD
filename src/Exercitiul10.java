import java.io.*;

public class Exercitiul10 {
    public static void main(String[] args) throws IOException {

        File file = new File("src/text.txt");
        if (file.createNewFile()) {
            System.out.println("File was created");
        } else {
            System.out.println("File already exists");
        }

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        bufferedReader.skip(5);
        String read = bufferedReader.readLine();

        if (read.length() < 10) {
            System.out.println("Numarul de caractere este: " + read.length());
        } else {
            System.out.println(read);
        }
    }
}