package es.studium.TablaPosicionMaximoV2Mia;

import java.util.Scanner;

public class PosicionMaximoV2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int numero;
		int maximo;
		int posicion=0;
		int[] tabla = new int[10];
		for (int i = 0; i <= 9; i++) {
			System.out.println("Dime un número entero");
			numero = teclado.nextInt();
			tabla[i] = numero;
		}
		for (int i = 0; i <= 9; i++) {
			maximo = tabla[0];
			for (i = 0; i <= 9; i++) {
				if (tabla[i] > maximo) {
					maximo = tabla[i];
					posicion = i;
				}
			}
			System.out.println(maximo);
			System.out.println(posicion);
			teclado.close();
		}

	}

}
