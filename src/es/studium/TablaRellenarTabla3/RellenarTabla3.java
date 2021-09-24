package es.studium.TablaRellenarTabla3;
 
import java.util.Scanner;
 
public class RellenarTabla3
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