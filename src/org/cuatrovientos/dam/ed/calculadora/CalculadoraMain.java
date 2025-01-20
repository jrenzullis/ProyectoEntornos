package org.cuatrovientos.dam.ed.calculadora;

import java.util.Scanner;

public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nuemroElegido;
		int numero2;
		int numero3;
		
		
		mostrarMenu();
		
		
		String eleccion = scanner.nextLine();
		nuemroElegido = Integer.parseInt(eleccion);
		System.out.println("dame un numero");
		String numero2str = scanner.nextLine();
		numero2 = Integer.parseInt(numero2str);
		System.out.println("dame otro numero");
		String numero3str = scanner.nextLine();
		numero3 = Integer.parseInt(numero3str);
		
		
		if (nuemroElegido == 1) {
			System.out.println("su suma es " + (numero2 + numero3));
		} else if (nuemroElegido == 2) {
			System.out.println("su resta es " + (numero2 - numero3));
		} else if (nuemroElegido == 3) {
			System.out.println("su division es " + (numero2 / numero3));
		} else if (nuemroElegido == 4) {
			System.out.println("su multiplicacion es " + (numero2 * numero3));
		}

	}

	private static void mostrarMenu() {
		System.out.println("MENU CALCULADORA");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Division");
		System.out.println("4.Multiplicacion");
	}

}
