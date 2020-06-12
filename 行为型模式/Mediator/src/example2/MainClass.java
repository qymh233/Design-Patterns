package example2;


public class MainClass {

		public static void main(String[] args) {
			Mediator mediator =new Mediator();
			Person zhangsan=new Man("zhangsan", 5,mediator);
			Person lisi=new Man("lisi",6,mediator);
			Person xiaofang=new Woman("xiaofang", 6,mediator);
			//zhangsan.getPartner(xiaofang);
			zhangsan.getPartner(lisi);
	}
	
	
	
}
