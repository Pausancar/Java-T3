package es.studium.Cadena12_Mayor;

import java.util.Scanner;

public class Mayorv2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String[]tabla=new String[5];
		String mayor = null;
		for (int i=0;i<(tabla.length);i++)
		{
			System.out.println("Escriba la palabra número " +(i+1));
			tabla[i]= teclado.nextLine();
		}
		mayor = tabla[0];
		for (int i=0;i<tabla.length;i++)
		{
			if (tabla[i].compareTo(mayor)>0)
			{
				mayor = tabla[i];
			}
		}
		System.out.println("La cadena alfabéticamente mayor es: " +mayor);
		teclado.close();

	}

}
