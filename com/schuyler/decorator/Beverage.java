public abstract class Beverage {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public void prettyPrint() {
    System.out.println(getDescription() + " $" + cost());
  }
}
