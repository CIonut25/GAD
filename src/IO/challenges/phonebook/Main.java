package IO.challenges.phonebook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findNumbers();
    }

    public static void findNumbers() {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("D:\\IDE\\GAD2023Java\\src\\IO\\challenges\\phonebook\\in.txt")));
            while (scanner.hasNext()) {
                String line  = scanner.nextLine();
                if (line.contains("Abbey") || line.contains("Abdul")){
                    String[] splitLine = line.split("\\s+");
                    String number = splitLine[1];
                    System.out.print(number + " ");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
