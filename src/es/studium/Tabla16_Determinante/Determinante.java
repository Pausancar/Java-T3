package es.studium.Tabla16_Determinante;

import java.util.Scanner;

public class Determinante
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int determinante = 0;
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.println("Indique el número de la matriz situado en la posición "+i+","+j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println("");                                    
		System.out.println("La matriz es:\n");
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.print("\t"+matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		determinante=(((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[0][1]*matriz[1][2]*matriz[2][0])+(matriz[0][2]*matriz[1][0]*matriz[2][1]))-((matriz[2][0]*matriz[1][1]*matriz[0][2])+(matriz[2][1]*matriz[1][2]*matriz[0][0])+(matriz[2][2]*matriz[1][0]*matriz[0][1])));
		System.out.println("El determinante de la matriz es: "+determinante);                              teclado.close();           

	}

}
