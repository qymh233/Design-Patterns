package myfluat;

import java.lang.reflect.InvocationTargetException;

public class Mainclass {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		// TODO Auto-generated method stub
//		Fluit apple=FluitFactory.getApple();
//		Fluit banana=FluitFactory.getBanana();
//		apple.get();
//		banana.get();
		
//		Fluit apple=FluitFactory.getFluit("apple");
//		Fluit banana=FluitFactory.getFluit("banana");
//		apple.get();
//		banana.get();
		
		Fluit apple=FluitFactory.getFluit("myfluat.Apple");
		Fluit banana=FluitFactory.getFluit("myfluat.Banana");
		apple.get();
		banana.get();
		
	}

}
