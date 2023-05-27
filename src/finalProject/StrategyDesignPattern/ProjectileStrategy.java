package finalProject.StrategyDesignPattern;
public class ProjectileStrategy implements DragonSlayingStrategy {

  @Override
  public void execute() {
    System.out.println("Ai tras in dragon cu arcul magic si acesta a cazut la pamant !");
  }
}
