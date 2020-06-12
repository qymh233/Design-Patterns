package example3;

public class WanStste extends State {

	@Override
	public void doSomething(Person person) {
		// TODO Auto-generated method stub
		if(person.getHour()==18) {
		
			System.out.println("wan");
		}else {
			person.setState(new OtherStste());
			person.doSomething();
		}
	}

}
