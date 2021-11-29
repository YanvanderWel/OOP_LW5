
package oop.lw5_second_version;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isProgramFinished = false;
		Scanner sc = new Scanner(System.in);

		AbstractCalc oc = new OrdinaryCalc();
		IAdvanced ac = new AdvancedCalc();

		while (isProgramFinished == false) {
			System.out.print("Введіть перше число для арифметичних операцій: ");
			double num1 = sc.nextDouble();
			oc.setNum1(num1);

			System.out.print("Введіть друге число для арифметичних операцій: ");
			double num2 = sc.nextDouble();
			
			while (num2 == 0) {
				System.out.print("Помилка! Введіть число яке не дорівнює 0: ");
				num2 = sc.nextDouble();
			}
			
			oc.setNum2(num2);

			System.out.print("Введіть число для конвертації з гривень у євро: ");

			double digitForConverting = sc.nextDouble();

			while (digitForConverting <= 1 || digitForConverting >= 100000) {
				System.out.print("Помилка! Введіть число в межах від 1 до 100000 включно: ");
				digitForConverting = sc.nextDouble();
			}

			System.out.println("Арифметичні операції з числами: " + num1 + " та " + num2);
			System.out.println(oc.add());
			System.out.println(oc.sub());
			System.out.println(oc.mul());
			System.out.println(oc.div());

			System.out.println("Ковертація числа " + digitForConverting + " з гривень у євро:");
			System.out.println(ac.convertUAHToEUR(digitForConverting));

			System.out.print("Чи бажаєте ви завершити програму (Y/N): ");
			if ("Y".equals(sc.next())) {
				isProgramFinished = true;
			}

		}
		sc.close();

	}
}
