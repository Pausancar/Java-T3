package es.studium.Tabla15_LetraPosicion;

import java.util.Scanner;

public class LetraPosicion
{

	public static void main(String[] args)
	{
		final int FILAS = 3;
		final int COLUMNAS = 3;
		char matriz[][] = new char[FILAS][COLUMNAS];
		int matrizFinal[][]= new int [FILAS][COLUMNAS];
		Scanner teclado = new Scanner (System.in);
		for(int i=0;i<FILAS;i++)
		{
			for(int j=0;j<COLUMNAS; j++)
			{
				System.out.println("Dime el car�cter de la posici�n ["+i+"]["+j+"]");
				matriz[i][j]=teclado.nextLine().charAt(0);
			}
		}
		teclado.close();
		for(int i=0;i<FILAS;i++)
		{
			for(int j=0;j<COLUMNAS; j++)
			{
				matrizFinal[i][j]=matriz[i][j]-96;
			}
		}
			for(int i=0;i<FILAS;i++)
			{
				for(int j=0;j<COLUMNAS; j++)
				{
					System.out.print(matrizFinal[i][j]+ "\t");
				}
				System.out.println();
			}
	}

}
