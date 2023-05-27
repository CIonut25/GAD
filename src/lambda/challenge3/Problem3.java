package lambda.challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Programming"));

        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
