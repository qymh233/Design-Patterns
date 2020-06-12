package example2;

public class Person {

	private int hour;
	private State state;

	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void doSomething() {
		if(hour==7) {
			state=new ZaoStste();
			state.doSomething();
		}else if(hour==12) {
			state=new WuStste();
			state.doSomething();
		}else if(hour==18) {
			state=new WanStste();
			state.doSomething();
		}else {
			state=new OtherStste();
			state.doSomething();
		}
	}
}
