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
	//���캯��˽�л�
	private Person3() {
		
	}
	//����ʽ
	//�ṩһ��ȫ�־�̬������ʹ��ͬ������
	public static synchronized Person3 getPerson() {
		//return new Person2();
		if(person==null) {
			person=new Person3();
		}
		return person;
	}
}
