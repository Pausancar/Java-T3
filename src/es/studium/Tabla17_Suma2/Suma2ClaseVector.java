package es.studium.Tabla17_Suma2;

import java.util.Scanner;
import java.util.Vector;

public class Suma2ClaseVector
{

	public static void main(String[] args)
	{
		int numero, suma;
		Vector  <Integer> v = new Vector <Integer>();
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime la longitud del vector");
		int longitud=teclado.nextInt();
		suma = 0;
		for(int i=0; i<longitud; i++)
		{
			System.out.println("Dime la longitud del vector");
			numero=teclado.nextInt();
			v.addElement(numero);
			suma = suma + numero;
			
		}
		teclado.close();
		for(int i=0; i<longitud; i++)
		{
			System.out.print("\t" + v.elementAt(i));
			
		}
		System.out.println("La suma de todos los elementos del vector es " + suma);
	}

}
