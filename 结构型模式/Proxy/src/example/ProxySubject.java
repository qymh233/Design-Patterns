package example;

public class ProxySubject implements Subject {


	private RealSubject realSubject;
	public void sailBook() {
		// TODO Auto-generated method stub
		dazhe();
		if(realSubject==null) {
			realSubject=new RealSubject();
		}
		this.realSubject.sailBook();
		give();
	}
	public void dazhe() {
		System.out.println("����");
	}
	public void give() {
		System.out.println("�ʹ���ȯ");
	}

}
