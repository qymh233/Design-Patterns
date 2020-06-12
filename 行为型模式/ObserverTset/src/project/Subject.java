package project;

public interface Subject {

	//注册观察者
	public void registObserver(Observer observer);
	//取消观察者
	public void removeObserver(Observer observer);
	//通知观察者
	public void notifyObserver();
	//获取消息
	public String getMsg() ;
}
