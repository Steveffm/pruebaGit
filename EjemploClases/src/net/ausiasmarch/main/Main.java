package net.ausiasmarch.main;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int operacion;

		System.out.print("Dime un numero: ");

		Calculadora.setNum1(teclado.nextInt());

		System.out.print("Dime otro numero: ");

		Calculadora.setNum2(teclado.nextInt());

		do {

			System.out.println("Que quieres hacer");
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir");

			System.out.print("Opcion: ");

			operacion = teclado.nextInt();

			switch (operacion) {

			case 1:

				System.out.println("Resultado: " + Calculadora.Suma());

				break;

			case 2:

				System.out.println("Resultado: " + Calculadora.Resta());

				break;

			case 3:

				System.out.println("Resultado: " + Calculadora.Multiplicar());

				break;

			case 4:

				System.out.println("Resultado: " + Calculadora.Dividir());

				break;

			case 5:

				System.out.println("Hasta luego");

				break;
				
			default: 
				
				System.out.println("Opcion no valida");
				
				break;

			}
 
		} while (operacion < 1 || operacion > 5);

	}

}
