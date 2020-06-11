package example;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("minus");
		//获得上下文环境
		String input=context.getInput();
		//进行类型转换
		int intinput=Integer.parseInt(input);
		//进行递增
		--intinput;
		//对上下文环境重新进行赋值
		context.setInput(String.valueOf(intinput));
		context.setOutput(intinput);
	}

}
