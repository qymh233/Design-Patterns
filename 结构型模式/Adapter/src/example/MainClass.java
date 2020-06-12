package example;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Current current=new Current();
//		current.use220V();
//		Adapter adapter=new Adapter();
//		adapter.use18V();
	Adapter2 adapter2=new Adapter2(new Current());
	adapter2.use18V();
	}

}
