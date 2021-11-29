package lw5_second_version;

public class AdvancedCalc extends OrdinaryCalc implements IAdvanced {

	public AdvancedCalc() {
	}

	public double convertUAHToEUR(double a) {
		double convertedA = ((a * 0.038752) / 1.18235);
		return convertedA;
	}

}