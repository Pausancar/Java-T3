package es.studium.Cadena7_Longitud;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		teclado.close();
		System.out.println("La longitud incluidos los espacios es "+ frase.length());
		System.out.println("La longitud sin incluir los espacios es " +  frase.replace(" ","").length());
	}

}
