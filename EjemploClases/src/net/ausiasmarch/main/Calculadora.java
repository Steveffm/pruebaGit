package net.ausiasmarch.main;

public class Calculadora {

	public static double num1;
	public static double num2;

	public static void setNum1(double num1) {
		Calculadora.num1 = num1;
	}

	public static void setNum2(int num2) {
		Calculadora.num2 = num2;
	}

	public static double Suma() {

		return num1 + num2;

	}

	public static double Resta() {

		return num1 - num2;

	}

	public static double Multiplicar() {

		return num1 * num2;

	}

	public static double Dividir() {

		return num1 / num2;

	}

}
