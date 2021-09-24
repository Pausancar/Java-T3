package es.studium.Cadena11_Comparar;

import java.util.Scanner;

public class Compararv2
{

	public static void main(String[] args)
	{
		 Scanner teclado = new Scanner(System.in);
         String palabra1,palabra2;
         System.out.println("Escriba una palabra:");
         palabra1 = teclado.nextLine();
         System.out.println("Escriba otra palabra:");
         palabra2 = teclado.nextLine();
         if (palabra1.compareTo(palabra2)>0)
         {
                     System.out.println("La palabra 1 es alfabéticamente mayor que la palabra 2");
         }
         else if (palabra1.compareTo(palabra2)==0)
         {
                     System.out.println("La palabra 1 es alfabéticamente igual que la palabra 2");
         }
         else
         {
                     System.out.println("La palabra 1 es alfabéticamente menor que la palabra 2");
         }
         teclado.close();

	}

}
