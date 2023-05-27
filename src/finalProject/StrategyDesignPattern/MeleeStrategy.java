package finalProject.StrategyDesignPattern;
public class MeleeStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("Cu sabia Excalibur ai taiat capul dragonului !");
  }
}
