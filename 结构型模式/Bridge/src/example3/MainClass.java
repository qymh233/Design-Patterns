package example3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine engine1=new Engine2000();
		Engine engine2=new Engine2200();
		
		Car car1=new Bus(engine1);
		car1.installEngine();
		
		Car car2=new Jeep(engine2);
		car2.installEngine();
		Car  car3=new Jeep(engine1);
		car3.installEngine();
		
	}

}
