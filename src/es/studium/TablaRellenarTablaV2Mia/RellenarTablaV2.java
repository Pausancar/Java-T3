package es.studium.TablaRellenarTablaV2Mia;

import java.util.Vector;

public class RellenarTablaV2
{

	public static void main(String[] args)
	{
		int[] Pares = new int[20];
		Vector<Integer> p = new Vector<Integer>();
		
			for(int j=0; j<40;j++)
			{
				if(j%2==0)
				{
					p.addElement(j);
				}
			}
			for(int i=0; i<20;i++)
			{
				Pares[i]=p.elementAt(i);
				System.out.println(Pares[i]);
			}

	}
}

