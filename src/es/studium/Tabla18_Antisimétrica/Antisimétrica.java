package es.studium.Tabla18_Antisim�trica;

import java.util.Scanner;

public class Antisim�trica
{

	public static void main(String[] args)
	{
		int[][] tabla = new int[3][3];
		boolean antisimetrica=true;
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
			}
		}
		teclado.close();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)

			{
				if(tabla[i][j]!=-(tabla[j][i]))
				{
					antisimetrica = false;
				}
			}
		}

				if(antisimetrica=true)
				{
					System.out.println("la matriz es antisim�trica");
				}
				else
				{
					System.out.println("la matriz no es antisim�trica");
				}
			}

	}

