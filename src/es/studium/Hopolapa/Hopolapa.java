package es.studium.Hopolapa;

import java.util.Scanner;

public class Hopolapa
{
	public static void main(String[] args) 
	{
		char[] vocales = new char[5];
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		String palabra, palabra2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una palabra:");
		palabra = teclado.nextLine();
		teclado.close();
		for(int i=0;i<palabra.length();i++)
		{
				if(palabra.charAt(i)=='a')
				{
					palabra=(palabra.substring(0,i) + 'p' + palabra.substring(i,palabra.length()));
				}
				System.out.println(palabra.substring(0,i) + 'p' + palabra.substring(i,palabra.length()));
		}
		

	}
}