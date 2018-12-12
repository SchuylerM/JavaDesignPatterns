public abstract class Duck {
	protected FlyBehavior flyBehavior;

	public void performFly() {
		this.flyBehavior.fly();
	}
}
