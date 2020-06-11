package example;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number="10";
		Context context =new Context(number);
		
//		Expression expression=new MinusExpression();
//		expression.interpret(context);
//		Expression expression2=new PlusExpression();
//		expression2.interpret(context);
//		System.out.println(context.getOutput());
		
		List<Expression>list=new ArrayList<Expression>();
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		for(int i=0;i<10;i++)
		{
			list.add(new PlusExpression());
		}
		for(Expression ex:list) {
			ex.interpret(context);
		}
		System.out.println(context.getOutput());
	}

}
