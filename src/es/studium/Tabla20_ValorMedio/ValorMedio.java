package es.studium.Tabla20_ValorMedio;

import java.util.Scanner;

public class ValorMedio
{

	public static void main(String[] args)
	{
    Scanner teclado = new Scanner(System.in);
    float[] tabla=new float[20];
    float media = (float) 0.0, suma=(float) 0.0;
    for (int i=0;i<20;i++)
    {
                System.out.println("Indique el precio que estará situado en la tabla situado en la posición: "+i);
                tabla[i] = teclado.nextFloat();
                suma = suma+tabla[i];
                media=suma/(i+1);
                if (tabla[i]>media)
                {
                           System.out.println("El valor introducido es mayor a la media de los anteriores");
                }
    }
    teclado.close();


	}

}
