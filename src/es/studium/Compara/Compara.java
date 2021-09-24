package es.studium.Compara;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		String a,b;
		int at,bt;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena");
		a = teclado.nextLine();
		System.out.println("Escribe otra cadena");
		b = teclado.nextLine();
		teclado.close();
		at = a.length();
		bt = b.length();
		if (at>bt)
		{
			System.out.println("La cadena " + a + " es mayor que la cadena " + b);
		}
		else if (at<bt)
			{
				System.out.println("La cadena " + b + " es mayor que la cadena " + a);
			}
			else
			{
				System.out.println("La cadena " + a + " y la cadena" + b + " son iguales");
			}
		
	}

}
