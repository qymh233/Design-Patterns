package myfluat;

import java.lang.reflect.InvocationTargetException;

public class FluitFactory {
	
//	//获得水果的实例
//	public static Fluit getApple() {
//		return new Apple();
//	}
//	public static Fluit getBanana() {
//		return new Banana();
//	}
	
//	public static Fluit getFluit(String type) throws InstantiationException, IllegalAccessException {
//		if(type.equalsIgnoreCase("apple")) {
//			return Apple.class.newInstance();
//		}else if (type.equalsIgnoreCase("banana")) {
//			return Banana.class.newInstance();
//		}else {
//			return null;
//		}
//	}
	public static Fluit getFluit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class fluit=Class.forName(type);
		return (Fluit) fluit.getDeclaredConstructor().newInstance();
	}
}
