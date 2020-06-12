package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person zhangsna=new Man("zhangsan", 5);
		Person lisi=new Man("lisi",6);
		Person xiaofang=new Woman("xiaofang", 6);
		
		zhangsna.getPartner(xiaofang);
		xiaofang.getPartner(lisi);
		zhangsna.getPartner(lisi);
	}

}
