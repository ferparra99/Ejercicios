/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fer;
import java.util.Scanner;
/**
 *
 * @author Aprendiz
 */
public class Trans {
   public static void main(String[] args) {
       
   
    Scanner entrada=new Scanner(System.in);
   
    int cantidad1[][]= new int[5][5];
    
    int a;
   
        
    
            
            
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.println("Digite un numero [" +i+"]["+j+"] \n");
			cantidad1[i][j]= entrada.nextInt();
			
		}
	}

	System.out.println("\t\t\t imprimiendo...");
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			System.out.print("["+i+"]["+j+"] \n");
			System.out.print(cantidad1 [i][j]+"\n");
		}
		          System.out.print(i);
	}
	
	System.out.println( "matriz transpuesta \n");
        
        
        System.out.println( "Elija que sentido quiere ver \n");
        System.out.println( "+5 - 1.5.9.19 \n");
        System.out.println( "-5 - 1.2.3.4 \n");
         a= entrada.nextInt();
    
    
    if (a<5)
    {
        
	for (int i=0;i<4;i++)
	{
		System.out.print("............ \n");
		for(int j=0;j<4;j++)
		{
			
			if (cantidad1[i][j]<10)
			{
			
		
			System.out.print(cantidad1[i][j]);
			System.out.print(" |");
			
			}
			else
			{
			
			System.out.print (cantidad1[i][j]);
			System.out.print("|");
			}
		
		
		}
		System.out.print("\n");
	System.out.print("............ \n");
	
	}
        
        
        
        
    }
    else
        
    {
        for (int i=0;i<4;i++)
	{
		System.out.print("............ \n");
		for(int j=0;j<4;j++)
		{
			
			if (cantidad1[j][i]<10)
			{
			
		
			System.out.print(cantidad1[j][i]);
			System.out.print(" |");
			
			}
			else
			{
			
			System.out.print (cantidad1[j][i]);
			System.out.print("|");
			}
		
		
		}
		System.out.print("\n");
	System.out.print("............ \n");
	
	}
    }
	}
}


