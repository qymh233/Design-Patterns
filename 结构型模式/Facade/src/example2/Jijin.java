package example2;

public class Jijin {

	private Qihuo qihuo;
	private Guozai guozai;
	private Gupiao gupiao;
	
	public Jijin() {
		qihuo =new Qihuo();
		guozai=new Guozai();
		gupiao=new Gupiao();
	}
	
	public void jijinA() {
		qihuo.mai();
		guozai.mai();
	}
	public void jijinB() {
		qihuo.mai();
		gupiao.chao();
		guozai.mai();
	}
}
