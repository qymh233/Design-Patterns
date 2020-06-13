package example;

public class PingfangBuilder implements HouseBuilder {

	House house=new House();
	@Override
	public void makefloor() {
		// TODO Auto-generated method stub
		house.setFloor("pingfang-->floor");
	}

	@Override
	public void makewall() {
		// TODO Auto-generated method stub
		house.setWall("pingfang-->wall");
	}

	@Override
	public void makhousetop() {
		// TODO Auto-generated method stub
		house.setHousetop("pingfang-->housetop");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
