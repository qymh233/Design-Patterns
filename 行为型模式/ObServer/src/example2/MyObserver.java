package example2;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Article art=(Article) arg;
		System.out.println("滚去看");
		System.out.println("标题："+art.getArticleTitle());
		System.out.println("内容："+art.getArticleContent());
	}

}
