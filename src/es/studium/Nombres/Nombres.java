package es.studium.Nombres;

import java.util.Scanner;

public class Nombres
{

	public static void main(String[] args)
	{
		String nombre1,nombre2,nombre3,nombre4,nombre5;
		//String nombre1 = new String() es la manera mas correcta pero es lento
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escribe el primer nombre");
		nombre1 = teclado.nextLine();//nextLine es para una linea y next() una palabra o token solo
		System.out.println("El primer nombre es " + nombre1);
		System.out.println("Escribe el segundo nombre");
		nombre2 = teclado.nextLine();
		System.out.println("El segundo nombre es " + nombre2);
		System.out.println("Escribe el tercer nombre");
		nombre3 = teclado.nextLine();
		System.out.println("El tercer nombre es " + nombre3);
		System.out.println("Escribe el cuarto nombre");
		nombre4 = teclado.nextLine();
		System.out.println("El cuarto nombre es " + nombre4);
		System.out.println("Escribe el quinto nombre");
		nombre5 = teclado.nextLine();
		System.out.println("El quinto nombre es " + nombre5);
		teclado.close();
		/* tbn se puede mostrar por pantalla de la manera
		 * system.out.println(String.format("Las cadenas son 's%','s%','s%','s%' y " + "\"%s"\", nombre1, nombre2, nombre3, nombre4, nombre5)
		 */
		
	}

}
