package es.studium.zejemploRecorrerArray;

import java.util.Scanner;

public class ejemploRecorrerArray
{

	public static void main(String[] args)
	{
		int[] tabla = new int[20];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<=19;i++)
		{
			System.out.println("Dime el número que quieres que esté en la posición "+i+" de la tabla");
			tabla[i] = teclado.nextInt();
			System.out.println("El valor de la posición "+i+" es "+tabla[i]);
		}
		

	}

}
