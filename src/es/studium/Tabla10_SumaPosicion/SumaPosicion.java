package es.studium.Tabla10_SumaPosicion;

import java.util.Scanner;

public class SumaPosicion
{

	public static void main(String[] args)
	{
		int[][] tabla = new int[10][10];
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				tabla[i][j] = i + j;
			}
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				//System.out.println("El valor de la posición ["+i+"]["+j+"] es " + tabla[i][j]);
				System.out.print(tabla[i][j]+ "\t");
			}
			System.out.println();
	     }
	  }
}