package es.studium.Concatena;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		String cadena1, cadena2, cadena3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		cadena3 = cadena1 + cadena2;
		System.out.println("La tercera cadena es" + cadena3);
	}

}
