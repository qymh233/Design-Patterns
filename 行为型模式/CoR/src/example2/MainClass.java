package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarHandler headH=new CarHeadHandler();
		CarHandler bodyH=new CarBodyHandler();
		CarHandler tailH=new CarTailHandler();
		
		//组装顺序提前设定
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		//完成操作
		headH.HandlerCar();
		
		//简便操作
		headH.setNextHandler(bodyH).setNextHandler(tailH);
		headH.HandlerCar();
	}

}
