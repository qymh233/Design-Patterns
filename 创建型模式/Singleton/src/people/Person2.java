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
	//���캯��˽�л�
	private Person2() {
		
	}
	//����ʽ
	//�ṩһ��ȫ�־�̬����
	public static Person2 getPerson() {
		//return new Person2();
		if(person==null) {
			person=new Person2();
		}
		return person;
	}
}
