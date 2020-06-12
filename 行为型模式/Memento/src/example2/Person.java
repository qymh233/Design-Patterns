package example2;


public class Person {

	private String name;
	private String sex;
	private int age;
	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Person() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("name:"+name+",sex:"+sex+",age:"+age);
	}
	//��������
	public Memento makeMemento() {
		return new Memento(name, sex, age);
	}
	//��ԭ
	public void setMemento(Memento memento) {
		this.name=memento.getName();
		this.sex=memento.getSex();
		this.age=memento.getAge();
	}
	
}
