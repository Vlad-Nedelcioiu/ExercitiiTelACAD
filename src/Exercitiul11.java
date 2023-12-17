/*Citește un fișier și scrie într-un alt fișier toate liniile care încep cu cuvântul "copy" */

import java.io.*;
public class Exercitiul11 {
    public static void main(String[] args) throws IOException {

        File sourceFile = new File("src/source.txt");
        if (sourceFile.createNewFile()) {
            System.out.println("Source file was created");
        } else {
            System.out.println("Source file already exists");
        }

        File targetFile = new File("src/target.txt");
        if (targetFile.createNewFile()) {
            System.out.println("Target file was created");
        } else {
            System.out.println("Target file already exists");
        }


        FileReader sourceFileReader = new FileReader(sourceFile);
        BufferedReader sourceBufferedReader = new BufferedReader(sourceFileReader);

        FileWriter targetFileWriter = new FileWriter(targetFile);
        BufferedWriter targetBufferedWriter = new BufferedWriter(targetFileWriter);

        String line = sourceBufferedReader.readLine();

        try (targetBufferedWriter; sourceBufferedReader) {
            while (line != null) {
                if (line.startsWith("copy")) {
                    targetBufferedWriter.write(line);
                    targetBufferedWriter.newLine();
                    line = sourceBufferedReader.readLine();
                } else {
                    line = sourceBufferedReader.readLine();
                }
            }
        }
    }
}