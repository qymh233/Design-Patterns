package truth_example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Car flycar=new RunCar();
//		//CarDecorator flyCarDecorator=new FlyCarDecorator(flycar);
//		CarDecorator CarDecorator=new SwimCarDecorator(flycar);
//		CarDecorator.show();
		Car car=new RunCar();
		Car swimcar=new SwimCarDecorator(car);
		Car flyswimcar=new FlyCarDecorator(swimcar);
		flyswimcar.show();
		
	}

}
