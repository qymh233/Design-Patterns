package example3;

public class WuStste extends State {

	@Override
	public void doSomething(Person person) {
		// TODO Auto-generated method stub
		if(person.getHour()==12) {
		
			System.out.println("wu");
		}else {
			person.setState(new WanStste());
			person.doSomething();
		}
	}

}
