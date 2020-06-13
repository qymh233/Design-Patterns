package myfluit;

public class WenshiFluitFactory implements FluitFactory {

	@Override
	public Fluit getApple() {
		return new WenshiApple();
	}

	@Override
	public Fluit getBanana() {
		// TODO Auto-generated method stub
		return new WenshiBanana();
	}

}
