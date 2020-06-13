package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RealSubject realsubject=new RealSubject();
		//realsubject.sailBook();
		
		ProxySubject prosubject=new ProxySubject();
		prosubject.sailBook();
	}

}
