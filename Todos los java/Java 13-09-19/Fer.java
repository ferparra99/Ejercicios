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
public class Fer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad,i,j,fila,columna,auxiliar;
        int vector[]=new int[50];
        Scanner entrada=new Scanner(System.in);
            System.out.println("Digite");
            cantidad=entrada.nextInt();
            
                    
            for(i=1;i<=cantidad;i++)
            {
                System.out.println("\n ingrese el numero del indice vector "+i);
                vector[i]= entrada.nextInt();
                
            }
            for (fila=1;fila<=cantidad-1;fila++)
            {
                for (columna=1;columna<=cantidad-1;columna++)
                {
                    if(vector[columna]>vector[columna+1])
                    {
                        auxiliar=vector[columna];
                        vector[columna]=vector[columna+1];
                        vector[columna+1]=auxiliar;
                    }
                }
            }
            
            
            System.out.println("\n Ascendente");
                
                for(i=1;i<=cantidad;i++)
                {
                    System.out.println("   "+vector[i]);
                    
                }
                System.out.println("\n Descendente");
                for (i=cantidad;i>=1;i--)
                {
                    System.out.println(" "+vector[i]);
                }
                System.out.println("\n");
        
        
    }
    
}
