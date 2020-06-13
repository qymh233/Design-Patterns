package people;

public class Person2 {
	private String name;
	private static Person2 person;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person2() {
		
	}
	//懒汉式
	//提供一个全局静态方法
	public static Person2 getPerson() {
		//return new Person2();
		if(person==null) {
			person=new Person2();
		}
		return person;
	}
}
