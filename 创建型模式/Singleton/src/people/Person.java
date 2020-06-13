package people;

public class Person {
	public static final Person person=new Person();
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private Person() {
		
	}
	
	//¶öººÊ½
	public static Person getPerson() {
		return person;
	}
}
