package example;

public class HouseDirector {

//	private HouseBuilder builder;
//	public HouseDirector(HouseBuilder builder) {
//		this.builder=builder;
//	}
//	public void makeHouse() {
//		builder.makefloor();
//		builder.makewall();
//		builder.makhousetop();
//	}
	public void makeHouse(HouseBuilder builder) {
		builder.makefloor();
		builder.makewall();
		builder.makhousetop();
	}
}
