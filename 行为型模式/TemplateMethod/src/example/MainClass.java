package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MakeCar bus=new MakeBus();
//		bus.makeHead();
//		bus.mkaeBody();
//		bus.makeTail();
		bus.make();
		
		MakeCar jeep=new MakeJeep();
//		jeep.makeHead();
//		jeep.mkaeBody();
//		jeep.makeTail();
		jeep.make();
		
		
		MakeCar ka=new MakeKa();
		ka.make();
	}

}
