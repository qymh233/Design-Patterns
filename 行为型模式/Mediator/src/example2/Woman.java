package example2;

public class Woman extends Person {

	public Woman(String name, int condition,Mediator mediator) {
		super(name, condition,mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPartner(Person person) {
		// TODO Auto-generated method stub
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(person);
	}

}
