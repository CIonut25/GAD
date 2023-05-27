package lambda.challenge3;


import java.util.LinkedHashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("grapes", 3);

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v) -> sb.append(k).append(" -> ").append(v).append(System.lineSeparator()));
        System.out.println(sb.toString());

    }
}
