package example;

public abstract class MakeCar {

	public abstract void makeHead();
	public abstract void mkaeBody();
	public abstract void makeTail();
	public void make() {
		this.makeHead();
		this.mkaeBody();
		this.makeTail();
	}
}
