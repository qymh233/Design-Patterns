package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHandler headH=new CarHeadHandler();
		CarHandler bodyH=new CarBodyHandler();
		CarHandler tailH=new CarTailHandler();
		
		//��װ˳����ǰ�趨
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		//��ɲ���
		headH.HandlerCar();
		
		//������
		headH.setNextHandler(bodyH).setNextHandler(tailH);
		headH.HandlerCar();
	}

}
