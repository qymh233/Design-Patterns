package example4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peddler peddler =new Peddler();
		Command applecommand=new AppleCommand(peddler);
		Command bananacommand=new BananaCommand(peddler);
		
		Waiter waiter=new Waiter();
		waiter.setOrder(applecommand);
		waiter.setOrder(bananacommand);
		waiter.sail();
		waiter.removeOrder(bananacommand);
		waiter.sail();
	}
}
