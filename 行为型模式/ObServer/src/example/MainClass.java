package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		//ע��۲���
		person.addObserver(new MyObServer());
		person.setName("mike");
		person.setAge(23);
		person.setSex("1");

	}

}
