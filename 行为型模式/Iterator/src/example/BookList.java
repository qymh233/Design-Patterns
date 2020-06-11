package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {

	private List<Book> booklist;
	private int idx;
	private Iterator iterator;
	public BookList() {
		booklist=new ArrayList<Book>();
	}
	//添加书籍
	public void addBook(Book book) {
		booklist.add(book);
	}
	//删除书籍
	public void delBook(Book book) {
		int bookidx=booklist.indexOf(book);
		booklist.remove(bookidx);
	}
//	//判断是否有下一本书
//	public boolean hasNext() {
//		if(idx>=booklist.size()) {
//			return false;
//		}
//		return true;
//	}
//	//获取下一本书
//	public Book getNext() {
//		return booklist.get(idx++);
//	}
	
	
//	public List<Book> getBookList(){
//		return booklist;
//	}
	
	public Iterator Iterator() {
		return new Itr();
	}
	private class Itr implements Iterator{
		public boolean hasNext() {
			if(idx>=booklist.size()) {
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return booklist.get(idx++);
		}
		public void remove() {
			
		}
	}
}
