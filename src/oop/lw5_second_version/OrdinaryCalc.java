package oop.lw5_second_version;

public class OrdinaryCalc extends AbstractCalc {


	public OrdinaryCalc() {
	}
	public void test() {
		
	}
	public double add() {
		return getNum1() + getNum2();
	}

	public double div() {
		return getNum1() / getNum2();
	}

	public double mul() {
		return getNum1() * getNum2();
	}

	public double sub() {
		return getNum1() - getNum2();
	}

}
