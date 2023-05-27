
package finalProject.FactoryDesignPattern;



public class Main {


  public static void main(String[] args) {
    System.out.println("Alchimistul incepe sa lucreze !");
    var coin1 = CoinFactory.getCoin(CoinType.COPPER);
    var coin2 = CoinFactory.getCoin(CoinType.GOLD);
    System.out.println(coin1.getDescription());
    System.out.println(coin2.getDescription());
  }
}
