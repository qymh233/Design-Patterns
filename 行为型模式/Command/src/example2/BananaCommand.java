package example2;

public class BananaCommand extends Command {

	public BananaCommand(Peddler peddler) {
		super(peddler);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sail() {
		// TODO Auto-generated method stub
		this.getPeddler().sailBanana();;
	}

}
