package example;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("plus");
		//��������Ļ���
		String input=context.getInput();
		//��������ת��
		int intinput=Integer.parseInt(input);
		//���е���
		++intinput;
		//�������Ļ������½��и�ֵ
		context.setInput(String.valueOf(intinput));
		context.setOutput(intinput);
	}

}
