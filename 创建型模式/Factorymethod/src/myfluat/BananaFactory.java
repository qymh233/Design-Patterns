package myfluat;

public class BananaFactory implements FluitFactory {

	@Override
	public Fluit getFluit() {
		return new Banana();
	}

}
