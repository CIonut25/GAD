

## Obiectiv

Definirea unei familii de algoritmi, incapsularea lor, si ai ii face interschimbabili.Strategia permite
algoritmului sa varieze independent de clienții ce il folosesc.

In primul rand introducem interfata dragon-slaying strategy si implementarea acesteia.

```java
@FunctionalInterface
public interface DragonSlayingStrategy {

  void execute();
}


public class MeleeStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
      System.out.println("Cu sabia Excalibur ai taiat capul dragonului !");
  }
}


public class ProjectileStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
      System.out.println("Ai tras in dragon cu arcul magic si acesta a cazut la pamant !");
  }
}


public class SpellStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
      System.out.println("Ai folosit o vraja iar dragonul s-a evaporat !");
  }
}
```

Urmeaza clasa dragonslayer, care poate sa isi aleaga strategia de lupta bazata pe oponent .

```java
public class DragonSlayer {

  private DragonSlayingStrategy strategy;

  public DragonSlayer(DragonSlayingStrategy strategy) {
    this.strategy = strategy;
  }

  public void changeStrategy(DragonSlayingStrategy strategy) {
    this.strategy = strategy;
  }

  public void goToBattle() {
    strategy.execute();
  }
}
```

In final il avem in actiune pe DragonSlayer !

```java
  public class Main {

    private static final String RED_DRAGON_EMERGES = "Apare dragonul rosu !";
    private static final String GREEN_DRAGON_SPOTTED = "Dragonul verde este observat !";
    private static final String BLACK_DRAGON_LANDS = "Dragonul negru aterizeaza in spatele tau !";


    public static void main(String[] args) {
        System.out.println(GREEN_DRAGON_SPOTTED);
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        System.out.println(RED_DRAGON_EMERGES);
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        System.out.println(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();


    }}
```

Program output:

```
    Dragonul verde este observat !
Cu sabia Excalibur ai taiat capul dragonului !
Apare dragonul rosu !
Ai tras in dragon cu arcul magic si acesta a cazut la pamant !
Dragonul negru aterizeaza in spatele tau !
Ai folosit o vraja iar dragonul s-a evaporat !
```

