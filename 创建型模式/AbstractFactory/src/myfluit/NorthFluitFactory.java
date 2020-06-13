package myfluit;

public class NorthFluitFactory implements FluitFactory {

	@Override
	public Fluit getApple() {
		return new NorthApple();
		
	}

	@Override
	public Fluit getBanana() {
		return new NorthBanana();
	}

}
