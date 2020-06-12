package project;

public class ObserverPerson implements Observer {

	//定义观察者的名字
	private String name;
	//定义订阅的主题
	private Subject subject;
	//拉模式需要的信息
	private String msg;
	
	public ObserverPerson(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
		subject.registObserver(this);
	}
	//更新消息
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
	//取消订阅
	public void removeSub() {
		subject.removeObserver(this);
	}
}
