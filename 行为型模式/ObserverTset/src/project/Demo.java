package project;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����һ������
		WeChatSub  subject=new WeChatSub("���ɹ�����");
		//�����۲���
		ObserverPerson ob1=new ObserverPerson("����", subject);
		ObserverPerson ob2=new ObserverPerson("����", subject);
		ObserverPerson ob3=new ObserverPerson("����", subject);
		
		subject.setMsg(":���� "+subject.getName()+" Ϊ�������µ���Ϣ......");
		System.out.println("------------");
		ob2.removeSub();
		subject.setMsg(":���� "+subject.getName()+" Ϊ�������µ���Ϣ");
	}
}
