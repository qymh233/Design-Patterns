package project;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����һ������
		WeChatSub  subject=new WeChatSub("���ɹ�����");
		WeChatSub  subject2=new WeChatSub("�ڴ�ͼ���");
		//�����۲���
		ObserverPerson ob1=new ObserverPerson("����", subject);
		ObserverPerson ob2=new ObserverPerson("����", subject);
		ObserverPerson ob3=new ObserverPerson("����", subject2);
		
		subject.setMsg(":���� "+subject.getName()+" Ϊ�������µ���Ϣ");
		subject2.setMsg(":���� "+subject2.getName()+" Ϊ�������µ���Ϣ");
		System.out.println("------------");
		ob2.removeSub();
		subject.setMsg(":���� "+subject.getName()+" Ϊ�������µ���Ϣ");
		subject2.setMsg(":���� "+subject2.getName()+" Ϊ�������µ���Ϣ");
	}

}
