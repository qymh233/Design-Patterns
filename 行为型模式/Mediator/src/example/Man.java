package example;

public class Man extends Person {

	public Man(String name, int condition) {
		super(name, condition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPartner(Person person) {
		// TODO Auto-generated method stub
		if(person instanceof Man) {
			System.out.println("gay");
		}else {
			if(this.getCondition()==person.getCondition()) {
				System.out.println(this.getName()+" "+person.getName()+" nice");
			}else {
				System.out.println(this.getName()+" "+person.getName()+" bad");
			}			
		}
	}

}
