package es.studium.Cadena13_CambiarAporO;

import java.util.Scanner;

public class CambiarAporO
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
        String palabra;
        System.out.println("Escriba una palabra:");
        palabra = teclado.nextLine();
        teclado.close();
        String texto1=palabra.replace('a', 'o');
        System.out.println(texto1);
	}

}
