package example3;

public class ZaoStste extends State {

	@Override
	public void doSomething(Person person) {
		// TODO Auto-generated method stub
		if(person.getHour()==7) {
		
			System.out.println("zao");
		}else {
			person.setState(new WuStste());
			person.doSomething();
		}
	}

}
