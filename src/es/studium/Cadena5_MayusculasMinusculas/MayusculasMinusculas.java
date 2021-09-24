package es.studium.Cadena5_MayusculasMinusculas;

import java.util.Scanner;

public class MayusculasMinusculas
{

	public static void main(String[] args)
	{
		String cadena;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una cadena con letras mayúsculas y minúsculas");
		cadena = teclado.nextLine();
		teclado.close();
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());

	}

}
