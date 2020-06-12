package project;

public class ObserverPerson implements Observer {

	//����۲��ߵ�����
	private String name;
	//���嶩�ĵ�����
	private Subject subject;
	//��ģʽ��Ҫ����Ϣ
	private String msg;
	
	public ObserverPerson(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
		subject.registObserver(this);
	}
	//������Ϣ
	//@Override
	/*public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name+msg);
	}*/
	public void update() {
		// TODO Auto-generated method stub
		msg=this.subject.getMsg();
		System.out.println(name+msg);
	}
	//ȡ������
	public void removeSub() {
		subject.removeObserver(this);
	}
}
