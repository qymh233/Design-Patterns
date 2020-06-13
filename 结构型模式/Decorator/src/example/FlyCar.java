package example;

public class FlyCar implements Car {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		this.run();
		this.fly();
	}

	@Override
	public void run() {
		System.out.println("can run");		
	}
	public void fly() {
		System.out.println("can fly");
	}

}
