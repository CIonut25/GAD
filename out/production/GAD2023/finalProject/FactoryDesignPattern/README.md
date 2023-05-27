
## Obiectiv

Furnizarea unei metode statice încapsulate într-o clasă numită factory, pentru a ascunde implementarea
logica si a face codul client sa se concentreze pe utilizare, mai degraba decat pe initializarea unor noi obiecte.





Avem interfata `Coin`si cele doua implementari `GoldCoin` si `CopperCoin`.

```java
public interface Coin {
  String getDescription();
}

public class GoldCoin implements Coin {

  static final String DESCRIPTION = "Aceasta este o moneda de aur.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}

public class CopperCoin implements Coin {
   
  static final String DESCRIPTION = "Aceasta este o moneda de cupru.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
```

Enumeratia urmatoare reprezinta tipurile de monede pe care le cunoastem (`GoldCoin` si `CopperCoin`).

```java
@RequiredArgsConstructor
@Getter
public enum CoinType {

  COPPER(CopperCoin::new),
  GOLD(GoldCoin::new);

  private final Supplier<Coin> constructor;
}
```

Avem o metoda statica `getCoin` ce creaza obiecte de tip coin incapsulate in clasa factory. 
`CoinFactory`.

```java
public class CoinFactory {

  public static Coin getCoin(CoinType type) {
    return type.getConstructor().get();
  }
}
```

In final putem crea difertie tipuri de monede utilizand clasa factory.

```java
public class Main {
    
    public static void main(String[] args) {
        System.out.println("The alchemist begins his work.");
        var coin1 = CoinFactory.getCoin(CoinType.COPPER);
        var coin2 = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());
    }
}
```

Program output:

```
Alchimistul incepe sa lucreze !
Aceasta este o moneda de cupru.
Aceasta este o moneda de aur.
```





