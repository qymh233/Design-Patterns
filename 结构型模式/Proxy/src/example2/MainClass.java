package example2;

import java.lang.reflect.Proxy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RealSubject realSubject=new RealSubject();
		MyHandler myHandler=new MyHandler();
		myHandler.setRealsubject(realSubject);
		
		
		Subject proxySubject=(Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),realSubject.getClass().getInterfaces(), myHandler);
		proxySubject.sailBook();
		proxySubject.ggg();
	}

}
