package controller;

public class Controller 
{
	
	public Controller()
	{
		super();
	}
	
	
	public int[] PosVet(int[] vet, int tam, int itam)
	{
		if (tam <= itam)
		{
			return vet;
		}
		else
		{		
			
			int x = vet[tam - 1];
			vet[tam - 1] = vet[itam];
			vet[itam] = x;
			
			
			
			return PosVet(vet, (tam - 1), (itam + 1));
		}
	}
	
}
