package lw5_second_version;

public abstract class AbstractCalc {
	private double num1;
	private double num2;
	
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

	abstract double add();
	abstract double sub();
	abstract double mul();
	abstract double div();
}
