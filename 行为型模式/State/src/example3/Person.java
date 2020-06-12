package example3;

public class Person {

	private int hour;
	private State state;

	public Person() {
		state=new ZaoStste();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void doSomething() {
//		if(hour==7) {
//			state=new ZaoStste();
//			state.doSomething();
//		}else if(hour==12) {
//			state=new WuStste();
//			state.doSomething();
//		}else if(hour==18) {
//			state=new WanStste();
//			state.doSomething();
//		}else {
//			state=new OtherStste();
//			state.doSomething();
//		}
		
		state.doSomething(this);
		//¸´Î»
		state=new ZaoStste();
	}
}
