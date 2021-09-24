package es.studium.Tabla9_2dimensiones;

import java.util.Scanner;

public class Tabla2dimensiones
{

	public static void main(String[] args)
	{
		char[][] tabla = new char[3][4];
		Scanner teclado = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("Establece el caracter para ["+i+"[]"+j+"]");
				tabla[i][j] = teclado.nextLine().charAt(0);//transformamos la cadena h en el caracter h
			}
		}
		teclado.close();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println("El caracter de la posición ["+i+"]["+j+"] es " + tabla[i][j]);
				//si quisieramos que se muestre como matriz sería system.out.print(tabla[i][j]);
				//más bonito sería System.out.print(tabla[i][j]+"\t");
				
			}
			
			//System.out.println(); lo ponemos para que se vea la matriz
		}
	}

}