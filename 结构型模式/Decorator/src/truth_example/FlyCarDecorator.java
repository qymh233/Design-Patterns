package truth_example;

public class FlyCarDecorator extends CarDecorator {

	public FlyCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.getCar().show();;
		this.fly();
		
	}
	public void fly() {
		System.out.println("can fly");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
