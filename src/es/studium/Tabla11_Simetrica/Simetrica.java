package es.studium.Tabla11_Simetrica;

import java.util.Scanner;

public class Simetrica
{

	public static void main(String[] args)
	{
		int[][] tabla = new int[3][3];
		boolean simetrica=true;
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
			}
		}
		/*Esto ser�a para demostrar que en dos posiciones es simetrica pero tenemos que saber si es toda la matriz
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(tabla[i][j]==tabla[j][i])
				{
					System.out.println("En la posici�n "+i+","+j+" es sim�trica con la posici�n "+j+","+i);
				}
			}
		}*/
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)

			{
				if(tabla[i][j]!=tabla[j][i])
				{
					simetrica = false;
				}

				if(simetrica)
				{
					System.out.println("la matriz es sim�trica");
				}
				else
				{
					System.out.println("la matriz no es sim�trica");
				}
			}
		}
	}
	}
