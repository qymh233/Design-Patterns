package example;

public class ParkA implements ParkElement {
private String name;
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
	}

}
