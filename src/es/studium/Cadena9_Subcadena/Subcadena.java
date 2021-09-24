package es.studium.Cadena9_Subcadena;

import java.util.Scanner;

public class Subcadena
{

	public static void main(String[] args) 
	{
		String cadena=new String();
		int a,b;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduce una frase ");
		cadena=teclado.nextLine();
		System.out.println("Dame un número para la posición ");
		a=teclado.nextInt();
		do 
		{
			System.out.println("Dame un número para la longitud ");
			b=teclado.nextInt();
		}while (a+b>cadena.length());

		System.out.println("la subcadena pedida es: '"+subcadena(cadena,a,b)+"'");
		teclado.close();

	}
	public static String subcadena(String cadena,int pos,int lon) 
	{
		String resultado=new String();
		for(int i=pos;i<(pos+lon);i++)
		{
			resultado=resultado+cadena.charAt(i);
		}

		return(resultado);
	}
}
   
