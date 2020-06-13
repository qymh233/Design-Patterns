package example;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		House house=new House();
//		house.setFloor("floor");
//		house.setHousetop("husetop");
//		house.setWall("wall");
		
//		HouseBuilder builder=new PingfangBuilder();
//		//调用工程队来修
//		builder.makefloor();
//		builder.makewall();
//		builder.makhousetop();
//		House house=builder.getHouse();
//		System.out.println(house.getFloor());
//		System.out.println(house.getHousetop());
//		System.out.println(house.getWall());
		//HouseBuilder builder=new PingfangBuilder();
		HouseBuilder builder=new GongeyuBuilder();
		//调用工程队来修
		//设计者设计
		//HouseDirector director=new HouseDirector(builder);		
		//director.makeHouse();
		HouseDirector director=new HouseDirector();
		director.makeHouse(builder);
		House house=builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getHousetop());
		System.out.println(house.getWall());
	}

}
