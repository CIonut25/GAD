package lambda.challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Programming"));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).charAt(0));
        }
        System.out.print(sb);
    }
}
