package example;

public class Adapter2 {

	private Current current;
	public Adapter2(Current current) {
		this.current=current ;
	}
	public void use18V() {
		System.out.println("use Adapter2");
		this.current.use220V();
	}
}
