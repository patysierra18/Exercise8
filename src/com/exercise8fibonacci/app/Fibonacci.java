package com.exercise8fibonacci.app;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{

			long fibonacci = 1;
			int cont1 = 0;
			int cont2 = 1;
			int bound = 0;	
				
			
			Scanner input= new Scanner(System.in);
					
					
			do
			{
				System.out.println("Dame un numero para calcular la serie de Fibonacci:");
				bound = input.nextInt();
				if (bound<=0)
				{
					System.out.println("Dedes de introducir un número arriba de cero...");
				}
				} while(bound<=0);
					
					for(int i =0;i<bound;i++)
					{
						
						System.out.print(fibonacci + " ");
						fibonacci = cont1+ cont2;
						cont1 = cont2;
						cont2= (int) fibonacci;
			
					
							
			} 
		
	
	}

}
