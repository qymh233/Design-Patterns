package example3;

public class Bus extends Car {

	public Bus(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.println("Bus install");
		this.getEngine().installEngine();
	}

}
