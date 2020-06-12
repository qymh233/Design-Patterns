package example;

public class Adapter extends Current {

	public void use18V() {
		System.out.println("use Adapter");
		this.use220V();
	}
}
