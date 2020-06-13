package myfluit;

public class MainClass {

	public static void main(String[] args) {
		FluitFactory ff=new NorthFluitFactory();
		Fluit apple=ff.getApple();
		apple.get();
		Fluit banana=ff.getBanana();
		banana.get();

		FluitFactory ff1=new SourthFluitFactory();
		Fluit apple1=ff1.getApple();
		apple1.get();
		Fluit banana1=ff1.getBanana();
		banana1.get();
		
		FluitFactory ff2=new WenshiFluitFactory();
		Fluit apple2=ff2.getApple();
		apple2.get();
		Fluit banana2=ff2.getBanana();
		banana2.get();
	}

}
