package es.stuium.zejemploTablaMultiplicar;

import java.util.Scanner;

public class ejemploTablaMultiplicar
{
	public static void main(String[] args)
	{
		int[] tabla = new int[10];
		Scanner teclado = new Scanner(System.in);
		for(int i=0; i<=9;i++)
		{
			System.out.println("Dime el n�mero que quieres que vaya en la posici�n "+i+" de la tabla.");
			tabla[i]=teclado.nextInt();
		}
		for(int i=0; i<=9;i++)
		{
			System.out.println("tabla["+i+"] ="+ tabla[i]*2);
		}
	}
}
