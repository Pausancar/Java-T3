/**package es.studium.TablaRellenarTabla2;

import java.util.Scanner;

public class RellenarTabla2
{

	public static void main(String[] args)
	{
		int Tabla[]=new int[4];
		Scanner teclado= new Scanner(System.in);
		for (int i=0;i<=3;i++)
			System.out.println("Dime el valor que quieres que tenga la tabla en la posición"+i);
			teclado.nextInt();
			Tabla[i]=teclado.nextInt();
		System.out.println(Tabla[0]);
		System.out.println(Tabla[1]);
		System.out.println(Tabla[2]);
		System.out.println(Tabla[3]);
	}

}
**/
package es.studium.TablaRellenarTabla2;
 
import java.util.Scanner;
 
public class RellenarTabla2 
{
            public static void main(String[] args) 
            {
                        Scanner teclado = new Scanner(System.in);
                        int tabla2[]=new int[4];
                        for (int i=0;i<=3;i++)
                        {
                                    System.out.println("Indicar el valor de la tabla en la posición "+i);
                                    tabla2[i] = teclado.nextInt();
                        }
                        for (int i=3;i>=0;i--)
                        {
                                    System.out.println(tabla2[i]);
                        }
                        teclado.close();           
            }
}