package example2;

public class Man extends Person {

	public Man(String name, int condition,Mediator mediator) {
		super(name, condition,mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPartner(Person person) {
		// TODO Auto-generated method stub
		this.getMediator().setMan(this);
		this.getMediator().getPartner(person);
	}

}
