package es.studium.TablaMaximoMinimoMedia;

import java.util.Scanner;

public class MaximoMinimoMedia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		int maximo;
		int minimo;
		int suma=0;
		int[] tabla = new int[10];
		for (int i = 0; i <= 9; i++) 
		{
			System.out.println("Dime un n�mero entero");
			numero = teclado.nextInt();
			tabla[i] = numero;
		}
		for (int i = 0; i <= 9; i++) 
		{
			maximo = tabla[0];
			minimo = tabla[0];
			for (i = 0; i <= 9; i++) 
			{
				suma = suma + tabla[i];
				if (tabla[i] > maximo) {
					maximo = tabla[i];
				}
				if (tabla[i] < minimo) {
					minimo = tabla[i];
				}
			}
			System.out.println("La media de todos los n�meros indicados es: " + ((float) suma / (float) 10));
			System.out.println("El n�mero m�ximo de los indicados es: " + maximo);
			System.out.println("El n�mero m�nimo de los indicados es: " + minimo);
			teclado.close();
		}

	}

}
//tbn se podr�a hacer ordenando de mayor a menor y cogiendo los numeros de los extremos
