package people;

public class Person4 {
	private String name;
	private static Person4 person;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//���캯��˽�л�
	private Person4() {
		
	}
	//˫�ؼ��
	//�ṩһ��ȫ�־�̬����
	public static Person4 getPerson() {
		//return new Person2();
		if(person==null) {
			synchronized(Person4.class) {
				if(person==null) {
					person=new Person4();
				}
				
			}
			
		}
		return person;
	}
}
