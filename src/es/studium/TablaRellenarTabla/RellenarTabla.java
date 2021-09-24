package es.studium.TablaRellenarTabla;

public class RellenarTabla
{

	public static void main(String[] args)
	{
	int Pares[]=new int[20];
	int i=0;
	for(i=0; i<=19; i++)
	{
		Pares[i]=(i+1)*2;
	}
	for(i=0; i<=19; i++)
	{
		System.out.println(Pares[i]);
	}
	

	}

}
