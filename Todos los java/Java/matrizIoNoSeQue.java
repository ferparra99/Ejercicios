package prueba;

import java.util.Scanner;

public class matrizIoNoSeQue {
    
    public static void main(String[] args) {
            int [][] c= new int[5][5];
            Scanner entrada = new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		
		for(int j=0;j<4;j++)
		{
                    System.out.println("Digite un numero["+i+"]["+j+"]\n");
                    c[i][j]=entrada.nextInt();
		}
	}
	
	       System.out.println("\t\t IMPRIMIENDO...");
	
	for(int i=0;i<4;i++)
	{	
		for(int j=0;j<4;j++)
		{
                    System.out.println("["+i+"]["+j+"]");
                    System.out.println(c[i][j]);
		}
	           System.out.println("\n");
	}
	
	       System.out.println("Matriz respuesta \n");
	
	       System.out.println("-------------------");
	
	for(int i=0;i<4;i++)
	{	
		
		for(int j=0;j<4;j++)
		{
			
			if (c[i][j]<10)
			{
			System.out.print(c[i][j]);
			System.out.print("  | ");
			}
			
			else
			{
			System.out.print(+c[i][j]);
			System.out.print(" | ");
			}
			
		}
		System.out.println("");
		System.out.println("-------------------");
	}
        System.out.println("\n");
        System.out.println("-------------------");
        	for(int i=0;i<4;i++)
	{	
		
		for(int j=0;j<4;j++)
		{
			
			if (c[j][i]<10)
			{
			System.out.print(c[j][i]);
			System.out.print("  | ");
			}
			
			else
			{
			System.out.print(+c[j][i]);
			System.out.print(" | ");
			}
			
		}
		System.out.println("");
		System.out.println("-------------------");
	}	
}
}



