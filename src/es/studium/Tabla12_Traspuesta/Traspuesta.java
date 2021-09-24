package es.studium.Tabla12_Traspuesta;

import java.util.Scanner;

public class Traspuesta
{

	public static void main(String[] args)
	{
		int[][] tabla1 = new int[3][3];
		int[][] tabla2 = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla1[i][j] = teclado.nextInt();
				tabla2[j][i] = tabla1[i][j];
				
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(tabla1[i][j]);
				
			}
			System.out.println();
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(tabla2[j][i]);
				
			}
			System.out.println();
		}
		
	}
}