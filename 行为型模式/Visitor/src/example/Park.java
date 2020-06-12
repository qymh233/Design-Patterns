package example;

public class Park implements ParkElement {

	private String name;
	private ParkA parkA;
	private ParkB parkB;
	public Park() {
		this.parkA =new ParkA();
		this.parkB =new ParkB();
		parkA.setName("A");
		parkB.setName("A");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		parkA.accept(visitor);
		parkB.accept(visitor);
	}

}
