package example2;

public class CarBodyHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		// TODO Auto-generated method stub
		System.out.println("body");
		if(this.carHandler!=null) {
			this.carHandler.HandlerCar();
		}
		
	}

}
