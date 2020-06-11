package example3;

public abstract class Command {

	private Peddler peddler;
	
	public Peddler getPeddler() {
		return peddler;
	}

	public Command(Peddler peddler) {
		super();
		this.peddler = peddler;
	}

	public void setPeddler(Peddler peddler) {
		this.peddler = peddler;
	}

	public abstract void sail();
}
