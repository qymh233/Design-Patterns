package myfluat;

import java.lang.reflect.InvocationTargetException;

public class Mainclass {

	public static void main(String[] args){

		FluitFactory ff=new AppleFactory();
		Fluit apple=ff.getFluit();
		apple.get();
		
		FluitFactory ff2=new BananaFactory();
		Fluit banana=ff2.getFluit();
		banana.get();
		
		
		FluitFactory ff3=new PeachFactory();
		Fluit peach=ff3.getFluit();
		peach.get();
	}

}
