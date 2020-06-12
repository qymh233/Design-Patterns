package example;

public class Person {

	private int hour;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void doSomething() {
		if(hour==7) {
			System.out.println("zao");
		}else if(hour==12) {
			System.out.println("wu");
		}else if(hour==18) {
			System.out.println("wan");
		}else {
			System.out.println("study");
		}
	}
}
