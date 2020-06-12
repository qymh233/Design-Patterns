package example2;

public class Mediator {

	private Man man;
	private Woman woman;
	public void setMan(Man man) {
		this.man = man;
	}
	public void setWoman(Woman woman) {
		this.woman = woman;
	}
	public void getPartner(Person person) {
		// TODO Auto-generated method stub
		if(person instanceof Man) {
			this.setMan((Man)person);
		}else {
			this.setWoman((Woman)person);		
		}
		if(man==null||woman==null) {
			System.out.println("gay");
		}else {
			if(man.getCondition()==woman.getCondition()) {
				System.out.println(man.getName()+" "+woman.getName()+" nice");
			}else {
				System.out.println(man.getName()+" "+woman.getName()+" bad");
			}	
		}
		
	}
}
