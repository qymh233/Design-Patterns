package example;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("minus");
		//��������Ļ���
		String input=context.getInput();
		//��������ת��
		int intinput=Integer.parseInt(input);
		//���е���
		--intinput;
		//�������Ļ������½��и�ֵ
		context.setInput(String.valueOf(intinput));
		context.setOutput(intinput);
	}

}
