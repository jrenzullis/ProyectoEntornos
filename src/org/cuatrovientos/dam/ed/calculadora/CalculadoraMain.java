package org.cuatrovientos.dam.ed.calculadora;

import java.util.Scanner;



public class CalculadoraMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numero;
		int numero2;
		int numero3;
		
		
		System.out.println("MENU CALCULADORA");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Division");
		System.out.println("4.Multiplicacion");
		
		
		String eleccion =scanner.nextLine();
		numero= Integer.parseInt(eleccion);
		System.out.println("dame un numero");
		String numero2str=scanner.nextLine();
		numero2= Integer.parseInt(numero2str);
		System.out.println("dame otro numero");
		String numero3str= scanner.nextLine();
		numero3= Integer.parseInt(numero3str);
		
		
		
		if (numero==1) {
			System.out.println("su suma es "+ (numero2+numero3));
		}else if (numero==2) {
			System.out.println("su resta es "+ (numero2-numero3));
		}else if (numero==3) {
			System.out.println("su division es "+ (numero2/numero3));
		}else if (numero==4) {
			System.out.println("su multiplicacion es "+ (numero2*numero3));
		}

		

	}

}
