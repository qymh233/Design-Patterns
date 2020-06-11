package example2;

public class CarTailHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		// TODO Auto-generated method stub
		System.out.println("tail");
		if(this.carHandler!=null) {
			this.carHandler.HandlerCar();
		}
		
	}

}
