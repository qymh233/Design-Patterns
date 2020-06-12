package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person("mike","000",25);
		//Memento memento=person.makeMemento();
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(person.makeMemento());
		person.display();
		
		person.setSex("1111");
		person.setAge(45);
		
		person.display();
		//person.setMemento(memento);
		person.setMemento(caretaker.getMemento());
		person.display();
	}

}
