package IO.challenges.occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> occurences = new LinkedHashMap<>();
        int counter = 1;
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/IO/challenges/occurence/input.txt")));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineParts = line.split("\\s+");
            for (String linePart : lineParts) {
                if (!occurences.containsKey(linePart)) {
                    occurences.put(linePart, counter);
                }else {
                    occurences.put(linePart, counter++);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : occurences.entrySet()) {
            System.out.printf("%s - %d\n", entry.getKey(),entry.getValue());
        }

    }
}
