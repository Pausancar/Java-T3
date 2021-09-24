package es.studium.Tabla19_SumaFilasColumnas;

import java.util.Scanner;

public class SumaFilasColumnas
{

	public static void main(String[] args)
	{
		int [] suma = new int[3];
		int[][] tabla = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		suma[0]=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
				suma[i]= suma[i] + tabla[i][j];
				
			}
			System.out.println("La suma de la fila " + i + "es " + suma[i]);
		}
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				System.out.println("Establece el valor para ("+i+","+j+")");
				tabla[i][j] = teclado.nextInt();
				suma[i]= suma[i] + tabla[i][j];
				System.out.println("La suma de la fila " + i + "es " + suma[i]);
			}
			
		}
		teclado.close();

	}

}
