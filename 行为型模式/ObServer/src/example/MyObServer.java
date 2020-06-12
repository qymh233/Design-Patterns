package example;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("对象发生变化");
	}

}
