package people;

public class Person3 {
	private String name;
	private static Person3 person;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//构造函数私有化
	private Person3() {
		
	}
	//懒汉式
	//提供一个全局静态方法，使用同步方法
	public static synchronized Person3 getPerson() {
		//return new Person2();
		if(person==null) {
			person=new Person3();
		}
		return person;
	}
}
