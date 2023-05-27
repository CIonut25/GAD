package IO.challenges.secretMessage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findText();
    }

    public static void findText() {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/IO/challenges/secretMessage/in.txt")));
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char letter = line.charAt(i);
                    if (Character.isLetter(letter) && Character.isUpperCase(letter)) {
                        if (letter == 'X'){
                            System.out.print(" ");
                        }else {
                            System.out.print(letter);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
