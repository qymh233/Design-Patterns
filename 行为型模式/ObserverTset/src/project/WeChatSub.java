package project;

import java.util.ArrayList;
import java.util.List;

public class WeChatSub implements Subject {
	//��Ϣ
	private String msg;
	//���ںŵ�����
	private String name;
	
	public WeChatSub(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}

	//������Ϣ
	public void setMsg(String msg) {
		this.msg = msg;
		//֪ͨ�۲���
		notifyObserver();
	}

	//������ù۲��ߵļ���
	private List<Observer> observers=new ArrayList<>();
	//ע��۲���
	@Override
	public void registObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	//ȡ���۲���
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(observer);
		if(i>0) {
			observers.remove(i);
		}
	}

	//֪ͨ�۲���
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		//�����۲���
		for(Observer ob:observers) {
			//������Ϣ
			//ob.update(msg);
			ob.update();
		}
	}

}
