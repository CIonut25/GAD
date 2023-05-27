
package finalProject.FactoryDesignPattern;


public class CopperCoin implements Coin {

  static final String DESCRIPTION = "Aceasta este o moneda de cupru.";

  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}
