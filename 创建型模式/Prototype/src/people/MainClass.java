package people;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
//		Person person=new Person();
//		person.setName("张三");
//		person.setAge(30);
//		person.setSex("男");
//
////		Person person2=new Person();
////		person2.setName("李四");
////		person2.setAge(30);
////		person2.setSex("男");
//		//Person person2=person;
//		Person person2=person.clone();
//		System.out.println(person2.getName());
//		person.setName("liuliuliu");
//		System.out.println(person.getName());
//		System.out.println(person2.getName());
		
		
		Person person1=new Person();
		List<String> friends=new ArrayList<String>();
		friends.add("yao");
		friends.add("liu");
		friends.add("zhao");
		
		person1.setFriends(friends);
		
		Person person2=person1.clone();
		
		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());
		
		friends.add("mika");
		person1.setFriends(friends);
		System.out.println(person1.getFriends());
		System.out.println(person2.getFriends());
	}

}
