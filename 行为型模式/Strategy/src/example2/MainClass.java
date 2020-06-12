package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num=200;
		Context context=new Context(new StrategyB());
		double NowNum=context.cost(num);
		System.out.println("实际花费"+NowNum);
	}

}
