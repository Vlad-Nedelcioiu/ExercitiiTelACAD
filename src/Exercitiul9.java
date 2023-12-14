//Reversed text

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiul9 {
    public static void main(String[] args) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String text = bufferedReader.readLine();

        char[] textCharArray = text.toCharArray();
        StringBuilder reversedText = new StringBuilder();
        for(int i = textCharArray.length - 1; i >= 0; i--){
            reversedText.append(textCharArray[i]);
        }
        System.out.println(reversedText);
    }
}
