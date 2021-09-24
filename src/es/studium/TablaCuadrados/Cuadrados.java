package es.studium.TablaCuadrados;

import java.util.Scanner;

public class Cuadrados
{

	public static void main(String[] args)
	{
		int tabla[]=new int[10];
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime un número");
		int numero=teclado.nextInt();
		teclado.close();
		for(int i=0;i<10;i++)
		{
			tabla[i]=(numero+1)*(numero+1);
			numero=numero+1;
			System.out.println(tabla[i]);
		}

	}



}


