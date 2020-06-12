package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Park park=new Park();
		park.setName("lol");
		Visitor visitorA=new VisitorA();
		Visitor visitorB=new VisitorB();
		Visitor visitorM=new VisitorManager();
		
		park.accept(visitorA);
		park.accept(visitorB);
		park.accept(visitorM);
	}

}
