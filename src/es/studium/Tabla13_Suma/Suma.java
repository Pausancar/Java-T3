package es.studium.Tabla13_Suma;

import java.util.Scanner;

public class Suma
{
		public static void main(String[] args)
		{
			final int FILAS = 3;
			final int COLUMNAS = 3;
			int i, j;
			int tabla1[][] = new int[FILAS][COLUMNAS];
			int tabla2[][] = new int[FILAS][COLUMNAS];
			int suma[][] = new int[FILAS][COLUMNAS];
			Scanner teclado = new Scanner(System.in);
			for (i = 0; i < FILAS; i++)
			{
				for (j = 0; j < COLUMNAS; j++)
				{
					System.out.println("Dame la posición [" + i + "][" + j + "] = ");
					tabla1[i][j] = teclado.nextInt();
				}
			}
			for (i = 0; i < FILAS; i++)
			{
				for (j = 0; j < COLUMNAS; j++)
				{
					System.out.println("Dame la posición [" + i + "][" + j + "] = ");
					tabla2[i][j] = teclado.nextInt();
				}

			}
			teclado.close();
			for (i = 0; i < FILAS; i++)
			{
				for (j = 0; j < COLUMNAS; j++)
				{
					suma[i][j] = tabla1[i][j] + tabla2[i][j];
				}

			}
			for (i = 0; i < FILAS; i++)
			{
				for (j = 0; j < COLUMNAS; j++)
				{
					System.out.print(suma[i][j]);
				}
				System.out.println();
			}
		}

	}

