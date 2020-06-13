package truth_example;

public class SwimCarDecorator extends CarDecorator {

	public SwimCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.getCar().show();
		this.swim();
		
	}
	public void swim() {
		System.out.println("can swim");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
