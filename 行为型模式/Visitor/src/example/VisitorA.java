package example;

public class VisitorA implements Visitor {


	@Override
	public void visit(Park park) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("清洁工A，完成"+parkA.getName());
		
	}

	@Override
	public void visit(ParkB parkB) {
		// TODO Auto-generated method stub
		
	}

}
