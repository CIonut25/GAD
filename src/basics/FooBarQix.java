package basics;

public class FooBarQix {
    public static String compute(int number) {
        String stringNumber = String.valueOf(number);
        String result = "";
        if (number % 3 == 0) {
            result += "Foo";
        } if (number % 5 == 0) {
            result += "Bar";
        } if (number % 7 == 0) {
            result += "Qix";
        }
        for (int i = 0; i < stringNumber.length(); i++) {
            char num = stringNumber.charAt(i);
            if (num == '3'){
                result += "Foo";
            }else if (num == '5'){
                result += "Bar";
            }else if (num == '7'){
                result += "Qix";
            }
        }
        if (!(number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && !(stringNumber.contains("3") || stringNumber.contains("5") || stringNumber.contains("7"))){
            result = String.valueOf(number);
        }
        return result;
    }

    public static String compute2(int number) {
        String stringNumber = String.valueOf(number);
        String result = "";
        if (number % 3 == 0) {
            result += "Foo";
        } if (number % 5 == 0) {
            result += "Bar";
        } if (number % 7 == 0) {
            result += "Qix";
        }
        for (int i = 0; i < stringNumber.length(); i++) {
            char num = stringNumber.charAt(i);
            if (num == '3'){
                result += "Foo";
            }else if (num == '5'){
                result += "Bar";
            }else if (num == '7'){
                result += "Qix";
            }else if (num == '0'){
                result += "*";
            }
        }
        if (!(number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && !(stringNumber.contains("3") || stringNumber.contains("5") || stringNumber.contains("7"))){
            result = String.valueOf(number);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(compute(15));
        System.out.println(compute2(105));
    }
}
