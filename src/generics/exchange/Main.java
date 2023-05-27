package generics.exchange;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws Exception {
        RON leu = new RON(200f);
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        System.out.println(exchangeDesk.convert(leu, USD.class));

    }
}
