package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCharacter mychar1=new MyCharacter('a');
		MyCharacter mychar2=new MyCharacter('b');
		MyCharacter mychar3=new MyCharacter('a');
		MyCharacter mychar4=new MyCharacter('d');
		
		mychar1.display();
		mychar2.display();
		mychar3.display();
		mychar4.display();
		
		if(mychar1==mychar3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		//创建工厂
		MyCharacterFactory factory=new MyCharacterFactory();
		//从工厂中取出相应的MyCharacter
		MyCharacter myChar1=factory.getMyCharacter('a');
		MyCharacter myChar2=factory.getMyCharacter('b');
		MyCharacter myChar3=factory.getMyCharacter('a');
		MyCharacter myChar4=factory.getMyCharacter('c');
		
		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();

		if(myChar1==myChar3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
