package example3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peddler peddler =new Peddler();
		Command applecommand=new AppleCommand(peddler);
		Command bananacommand=new BananaCommand(peddler);
		
		Waiter waiter=new Waiter();
		waiter.setCommand(applecommand);
		waiter.sail();
		waiter.setCommand(bananacommand);
		waiter.sail();
	}

}
