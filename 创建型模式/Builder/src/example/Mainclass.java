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
//		//���ù��̶�����
//		builder.makefloor();
//		builder.makewall();
//		builder.makhousetop();
//		House house=builder.getHouse();
//		System.out.println(house.getFloor());
//		System.out.println(house.getHousetop());
//		System.out.println(house.getWall());
		//HouseBuilder builder=new PingfangBuilder();
		HouseBuilder builder=new GongeyuBuilder();
		//���ù��̶�����
		//��������
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
