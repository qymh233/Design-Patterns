package example;

public class SwimCar implements Car {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.run();
		this.swim();
	}

	@Override
	public void run() {
		System.out.println("can run");		
	}
	public void swim() {
		System.out.println("can swim");
	}

}
