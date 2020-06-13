package example3;

public class Jeep extends Car {

	public Jeep(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void installEngine() {
		// TODO Auto-generated method stub
		System.out.println("Jeep install");
		this.getEngine().installEngine();
	}

}
