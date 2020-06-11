package example2;

public class CarHeadHandler extends CarHandler {

	@Override
	public void HandlerCar() {
		// TODO Auto-generated method stub
		System.out.println("head");
		if(this.carHandler!=null) {
			this.carHandler.HandlerCar();
		}
	}

}
