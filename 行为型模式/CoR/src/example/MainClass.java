package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHandler headH=new CarHeadHandler();
		CarHandler bodyH=new CarBodyHandler();
		CarHandler tailH=new CarTailHandler();
		
		headH.HandlerCar();
		bodyH.HandlerCar();
		tailH.HandlerCar();
	}

}
