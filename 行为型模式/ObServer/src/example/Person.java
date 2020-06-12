package example;

import java.util.Observable;

public class Person extends Observable {

	private String name;
	private String sex ;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.setChanged();
		System.out.println(this.hasChanged());
		this.notifyObservers();
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
		this.setChanged();
		this.notifyObservers();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		this.setChanged();
		this.notifyObservers();
	}
}
