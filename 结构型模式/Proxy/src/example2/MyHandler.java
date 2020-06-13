package example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private RealSubject realsubject;
	public void setRealsubject(RealSubject realsubject) {
		this.realsubject = realsubject;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result=null;
		dazhe();
		result=method.invoke(realsubject, args);
		give();
		return result;
	}
	public void dazhe() {
		System.out.println("´òÕÛ");
	}
	public void give() {
		System.out.println("ËÍ´ú½ðÈ¯");
	}


}
