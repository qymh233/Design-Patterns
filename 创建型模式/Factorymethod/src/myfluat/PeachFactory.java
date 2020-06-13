package myfluat;

public class PeachFactory implements FluitFactory {

	@Override
	public Fluit getFluit() {
		return new Peach();
	}

}
