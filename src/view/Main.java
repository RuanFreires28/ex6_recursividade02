package view;

import controller.Controller;

public class Main 
{

	public static void main (String[] args) 
	{
		Controller c = new Controller();
		
		int[] vet = {1,2,3,4,5,6,7,8,9,10,11};
		int tam = vet.length;
		int itam = 0;
		
		int[] resultado = c.PosVet(vet, tam, itam);
		
		for(int n : resultado)
		{
			System.out.println(n);
		}
	}
	
}
