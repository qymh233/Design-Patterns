package example4;

public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		this.getPeddler().sailApple();
	}

}
