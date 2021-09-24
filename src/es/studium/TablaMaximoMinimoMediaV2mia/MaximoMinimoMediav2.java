package es.studium.TablaMaximoMinimoMediaV2mia;

import java.util.Scanner;

public class MaximoMinimoMediav2
{

	public static void main(String[] args)
	{
	Scanner teclado = new Scanner(System.in);
	int tabla[]=new int [10];
	int numero;
	int suma;
	int minimo;		
	int maximo;
	
	float media;
	suma=0;
	for(int i=0;i<10;i++)
	{
		System.out.println("Dime un número");
		numero = teclado.nextInt();
		tabla[i]=numero;
		suma=suma+numero;
		
	}
	System.out.println("La suma es "+ suma);
	media=(float)suma/(float)10;
	System.out.println("La media es " + media);
	minimo= tabla[0];
	maximo= tabla[0];
	for(int i=0;i<10;i++)
	{
		if(tabla[i]>maximo)
		{
			maximo=tabla[i];
		}
		if(tabla[i]<minimo)
		{
			minimo=tabla[i];
		}
			
	}
		
	System.out.println("El máximo es "+ maximo);
	System.out.println("El mínimo es "+ minimo );
	}

}
