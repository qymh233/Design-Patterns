package example;

public class VisitorManager implements Visitor {

	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		System.out.println("����Ա���"+park.getName()+"����");
	}

	@Override
	public void visit(ParkA parkA) {
		// TODO Auto-generated method stub
		System.out.println("����Ա��鹫԰PartA����");
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		System.out.println("����Ա��鹫԰PartB����");
	}

}
