package myfluit;

public class SourthFluitFactory implements FluitFactory {

	@Override
	public Fluit getApple() {
		return new SourthApple();
	}

	@Override
	public Fluit getBanana() {
		return new SourthBanana();
	}

}
