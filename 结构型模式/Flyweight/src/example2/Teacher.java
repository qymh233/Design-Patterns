package example2;

public class Teacher extends Persson {

	private String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Teacher(String name, String sex, int age,String number) {
		super(name, sex, age);
		this.number=number;
		// TODO Auto-generated constructor stub
	}
	public Teacher() {
		super();
	}

}
