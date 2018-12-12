public abstract class Duck {
  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;


  public void performQuack() {
    this.quackBehavior.quack();
  }

  public void performFly() {
    this.flyBehavior.fly();
  }
}
