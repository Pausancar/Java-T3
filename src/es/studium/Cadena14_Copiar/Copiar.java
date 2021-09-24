package es.studium.Cadena14_Copiar;

import java.util.Scanner;

public class Copiar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
        String palabra, palabraCopia;
        System.out.println("Escriba una palabra:");
        palabra = teclado.nextLine();
        palabraCopia = palabra;
        System.out.println(palabraCopia);
        teclado.close();

	}

}
