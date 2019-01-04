public class MyCoffeeHouse {
  public static void main(String args[]) {
    Beverage beverage = new Espresso();
    beverage.prettyPrint();

    Beverage beverage2 = new HouseBlend();
    beverage2 = new Soy(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    beverage2.prettyPrint();
  }
}
