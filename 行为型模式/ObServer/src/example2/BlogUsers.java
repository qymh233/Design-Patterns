package example2;

import java.util.Observable;

public class BlogUsers extends Observable {

	public void publishBlog(String articleTitle,String articleContent) {
		Article article=new Article();
		article.setArticleTitle(articleTitle);
		article.setArticleContent(articleContent);
		System.out.println("文章标题："+articleTitle+",文章内容："+articleContent);
		this.setChanged();
		this.notifyObservers(article);
	}
}
