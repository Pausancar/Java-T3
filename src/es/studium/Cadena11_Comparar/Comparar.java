package es.studium.Cadena11_Comparar;

import java.util.Scanner;

public class Comparar
{

	public static void main(String[] args)
	{
	//es mayor la palabra que tiene un codigo ascii mayor, las minúsculasson mayores a las mayúsculas.	
		String cadena,cadena2;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una frase ");
		cadena=teclado.nextLine();
		System.out.println("Introduce otra frase");
		cadena2=teclado.nextLine();
		teclado.close();
		int valorCadena = 0;
		int valorCadena2 = 0;
		for(int i=0; i<=cadena.length() - 1;i++)
		{
			valorCadena=valorCadena + cadena.codePointAt(i);
			valorCadena2=valorCadena2 + cadena2.codePointAt(i);
		}
		if(valorCadena>valorCadena2)
		{
			System.out.println(cadena + " es mayor a " + cadena2);
		}
		else
		{
			if(valorCadena==valorCadena2)
			{
				System.out.println(cadena2 + " es igual a " + cadena);
			}
			else
			{
				System.out.println(cadena2 + " es menor a " + cadena);
			}
		}
	}

}
