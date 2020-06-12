package example;

public class VisitorManager implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		System.out.println("管理员检查"+park.getName()+"卫生");
	}

	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
		System.out.println("管理员检查公园PartA卫生");
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		System.out.println("管理员检查公园PartB卫生");
	}

}
