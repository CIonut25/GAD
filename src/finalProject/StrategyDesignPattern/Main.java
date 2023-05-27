package finalProject.StrategyDesignPattern;
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
