package es.studium.Cadena12_Mayor;

import java.util.Scanner;

public class Mayor
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
        String palabra1,palabra2,palabra3,palabra4,palabra5, palabraMayor;
        System.out.println("Escriba una palabra:");
        palabra1 = teclado.nextLine();
        System.out.println("Escriba otra palabra:");
        palabra2 = teclado.nextLine();
        System.out.println("Escriba otra palabra:");
        palabra3 = teclado.nextLine();
        System.out.println("Escriba otra palabra:");
        palabra4 = teclado.nextLine();
        System.out.println("Escriba otra palabra:");
        palabra5 = teclado.nextLine();
        teclado.close();
        String tabla[]= {palabra1, palabra2, palabra3, palabra4, palabra5};
        palabraMayor="";
        for(int i=0;i<4;i++)
        {
        	if (tabla[i].compareTo(tabla[i+1])>0)
        	{
        		palabraMayor=tabla[i];
        	}
        
        }
        System.out.println("La palabra alfabeticamente mayor es " + palabraMayor);

	}

}
