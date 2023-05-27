
package finalProject.FactoryDesignPattern;

public class GoldCoin implements Coin {

  static final String DESCRIERE = "Aceasta este o moneda de aur.";

  @Override
  public String getDescription() {
    return DESCRIERE;
  }
}
