package es.studium.Cadena8_BuscarPosicion;

import java.util.Scanner;

public class BuscarPosicion
{

	public static void main(String[] args)
	{
		String frase;
		char caracter;
		char fraseCaracter;
		int medidaFrase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = teclado.nextLine();
		System.out.println("Escribe el carácter a buscar");
		caracter = teclado.nextLine().charAt(0);
		teclado.close();
		medidaFrase = frase.length();
		for(int i=0;i<medidaFrase;i++)
		{
		 fraseCaracter=frase.charAt(i);
		 if(fraseCaracter==caracter)
		 {
			 System.out.println("Ese carácter se encuentra en la posición "+i);
			 i=medidaFrase;
		 }
		
		}
		
	}

}
