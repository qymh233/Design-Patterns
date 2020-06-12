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
		System.out.println("清洁工B，完成"+parkB.getName());
		
	}

}
