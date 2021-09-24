package es.studium.Tabla14_ProductoMatrizNumero;

import java.util.Scanner;

public class ProductoMatrizNumero
{

	public static void main(String[] args)
	{
		int matriz[][] = new int[3][3];
		int numero, posicion;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce un número");
		numero=teclado.nextInt();
		for(int i=0;i<3;i++)
		{
			for(int a=0;a<3; a++)
			{
				System.out.println("Dime el valor de la posición ["+i+"]["+a+"]");
				posicion=teclado.nextInt();
				matriz[i][a]=posicion;
				matriz[i][a] = matriz[i][a] * numero;
				
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int a=0;a<3; a++)
			{
				System.out.print("\t"+matriz[i][a]);
			
			}
			System.out.println("");
		}
		teclado.close();
	}

}
