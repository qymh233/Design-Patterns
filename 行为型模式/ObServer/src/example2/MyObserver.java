package example2;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Article art=(Article) arg;
		System.out.println("��ȥ��");
		System.out.println("���⣺"+art.getArticleTitle());
		System.out.println("���ݣ�"+art.getArticleContent());
	}

}
