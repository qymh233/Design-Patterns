package people;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 per=Person2.getPerson();
		Person2 per2=Person2.getPerson();
		per.setName("张三");
		per2.setName("李四");
		
		System.out.println(per.getName());
		System.out.println(per2.getName());
	}

}
