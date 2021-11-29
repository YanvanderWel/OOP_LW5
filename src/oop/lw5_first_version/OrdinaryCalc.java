package oop.lw5_first_version;

public class OrdinaryCalc {

	private double num1;
	private double num2;

	public OrdinaryCalc() {
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

	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
}
