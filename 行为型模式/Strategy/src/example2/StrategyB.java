package example2;

public class StrategyB implements Strategy {

	@Override
	public double cost(double num) {
		// TODO Auto-generated method stub
		if(num>=200) {
			return num-50;
		}
		return num;
	}

}
