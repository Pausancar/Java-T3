package es.studium.Cadena6_Igualdad;

import java.util.Scanner;

public class Igualdad
{

	public static void main(String[] args)
	{
		String cadena1;
		String cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Escribe otra cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		if(cadena1.equals(cadena2))
		{
			System.out.println("Las cadenas son iguales");
		}
		else
		{
			System.out.println("Las cadenas no son iguales");
		}
	}

}
