package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per1=new Person("mike","11",56);
		//�����ڲ�״̬
		Person backup=new Person();
		backup.setName(per1.getName());
		backup.setSex(per1.getSex());
		backup.setAge(per1.getAge());
		
		
		per1.display();
		
		//�޸�
		per1.setAge(25);
		per1.display();
		
		//�ع�
		per1.setName(backup.getName());
		per1.setSex(backup.getSex());
		per1.setAge(backup.getAge());
		per1.display();
		
	}

}
