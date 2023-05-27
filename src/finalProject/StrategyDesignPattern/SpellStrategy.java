package finalProject.StrategyDesignPattern;
public class SpellStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("Ai folosit o vraja iar dragonul s-a evaporat !");
  }

}
