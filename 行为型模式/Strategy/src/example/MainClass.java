package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Strategy strategy=new MD5Strategy() ;
//		strategy.encrypt();
		Context context=new Context(new MD5Strategy());
		context.encrypt();
	}

}
