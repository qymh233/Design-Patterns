package project;

public interface Subject {

	//ע��۲���
	public void registObserver(Observer observer);
	//ȡ���۲���
	public void removeObserver(Observer observer);
	//֪ͨ�۲���
	public void notifyObserver();
	//��ȡ��Ϣ
	public String getMsg() ;
}
