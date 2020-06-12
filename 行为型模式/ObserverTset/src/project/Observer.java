package project;

public interface Observer {

	//观察者获得消息
	//public void update(String msg);
	public void update();
	//取消订阅
	public void removeSub();
}
