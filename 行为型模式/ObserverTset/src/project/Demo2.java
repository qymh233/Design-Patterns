package project;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个主题
		WeChatSub  subject=new WeChatSub("内蒙古青年");
		WeChatSub  subject2=new WeChatSub("内大图书馆");
		//创建观察者
		ObserverPerson ob1=new ObserverPerson("张三", subject);
		ObserverPerson ob2=new ObserverPerson("李四", subject);
		ObserverPerson ob3=new ObserverPerson("王五", subject2);
		
		subject.setMsg(":您好 "+subject.getName()+" 为您发来新的消息");
		subject2.setMsg(":您好 "+subject2.getName()+" 为您发来新的消息");
		System.out.println("------------");
		ob2.removeSub();
		subject.setMsg(":您好 "+subject.getName()+" 为您发来新的消息");
		subject2.setMsg(":您好 "+subject2.getName()+" 为您发来新的消息");
	}

}
