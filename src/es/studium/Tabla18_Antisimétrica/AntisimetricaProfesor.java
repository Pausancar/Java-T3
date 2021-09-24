package es.studium.Tabla18_Antisimétrica;

import java.util.Scanner;

public class AntisimetricaProfesor
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		boolean antisimetrica=true;
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.println("Indique el número de la matriz situado en la posición "+i+","+j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println("La matriz 1 es:\n");
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.print("\t"+matriz[i][j]);
			}
			System.out.println("");
		}           
		System.out.println(""); 
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				if((matriz[i][j])!=(matriz[j][i])*(-1))
				{
					antisimetrica=false;
				}
			}
		}
		if (antisimetrica==true)
		{
			System.out.println("La matriz SI es antisimétrica");
		}
		else
		{
			System.out.println("La matriz NO es antisimétrica");
		}
		teclado.close();

	}

}
