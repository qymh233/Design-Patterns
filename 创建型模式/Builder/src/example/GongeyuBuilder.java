package example;

public class GongeyuBuilder implements HouseBuilder {

	House house=new House();
	@Override
	public void makefloor() {
		// TODO Auto-generated method stub
		house.setFloor("gongyu-->floor");
	}

	@Override
	public void makewall() {
		// TODO Auto-generated method stub
		house.setWall("gongyu-->wall");
	}

	@Override
	public void makhousetop() {
		// TODO Auto-generated method stub
		house.setHousetop("gongyu-->housetop");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
