/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.lw5_first_version;

/**
 *
 * @author Yan
 */
public class AdvancedCalc extends OrdinaryCalc {

	public AdvancedCalc() {
	}

	public double convertUAHToEUR(double a) {
		double convertedA = ((a * 0.038752) / 1.18235);
		return convertedA;
	}
}
