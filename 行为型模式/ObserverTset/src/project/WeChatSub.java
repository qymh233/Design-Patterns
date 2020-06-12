package project;

import java.util.ArrayList;
import java.util.List;

public class WeChatSub implements Subject {
	//消息
	private String msg;
	//公众号的名字
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

	//设置消息
	public void setMsg(String msg) {
		this.msg = msg;
		//通知观察者
		notifyObserver();
	}

	//定义放置观察者的集合
	private List<Observer> observers=new ArrayList<>();
	//注册观察者
	@Override
	public void registObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	//取消观察者
	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i=observers.indexOf(observer);
		if(i>0) {
			observers.remove(i);
		}
	}

	//通知观察者
	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		//遍历观察者
		for(Observer ob:observers) {
			//发送消息
			//ob.update(msg);
			ob.update();
		}
	}

}
