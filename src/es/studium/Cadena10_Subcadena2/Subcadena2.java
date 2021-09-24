package es.studium.Cadena10_Subcadena2;

import java.util.Scanner;

public class Subcadena2
{

	public static void main(String[] args)
	{
		String cadena=new String();
		int a;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una frase ");
		cadena=teclado.nextLine();
		System.out.println("Dame un número para la posición ");
		a=teclado.nextInt();
		teclado.close();
		int medida=cadena.length();
		for (int i=a; i<=medida-1;i ++)
		{
			System.out.print(cadena.charAt(i));
		}

	}

}
