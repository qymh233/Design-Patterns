package example;

public class VisitorB implements Visitor {

	
	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ParkA parkA) {
		
		
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("��๤B�����"+parkB.getName());
		
	}

}
