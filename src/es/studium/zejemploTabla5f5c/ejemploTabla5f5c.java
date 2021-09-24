package es.studium.zejemploTabla5f5c;

import java.util.Scanner;

public class ejemploTabla5f5c
{

	public static void main(String[] args)
	{
		int[][] tabla = new int[5][5];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println("El valor de la posición ("+i+","+j+") es " + tabla[i][j]);
			}
		}
	}

}
