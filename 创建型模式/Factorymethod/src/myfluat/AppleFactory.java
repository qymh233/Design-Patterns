package myfluat;

public class AppleFactory implements FluitFactory {
	public Fluit getFluit() {
		return new Apple();
	}
}
