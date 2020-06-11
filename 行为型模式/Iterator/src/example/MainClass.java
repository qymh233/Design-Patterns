package example;

import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1=new Book("0123", "red rain", 12);
		Book book2=new Book("0124", "green rain", 128);
		BookList bookList=new BookList();
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
//		while(bookList.hasNext()) {
//			Book book=bookList.getNext();
//			book.display();
//			
//		}
		
		
//		List<Book> bookDataList=bookList.getBookList();
//		for(int i=0;i<bookDataList.size();i++)
//		{
//			Book book=bookDataList.get(i);
//			book.display();
//		}
		
		Iterator iterator=bookList.Iterator();
		while(iterator.hasNext()) {
			Book book=(Book)iterator.next();
			book.display();
		}
	}

}
