package example2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlogUsers user=new BlogUsers();
		user.addObserver(new MyObserver());
		user.publishBlog("lalal", "asd");
		
	}

}
