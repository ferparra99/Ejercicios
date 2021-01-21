
package prueba;

import java.util.Scanner;


public class condicionIf {
    
    public static void main(String[] args) {
    
        int n;
        
        Scanner Entrada = new Scanner(System.in);
        
         System.out.println("Ingrese du edad");
         n=Entrada.nextInt();
        if (n>17)
                {
        System.out.println("Ingrese a cine para adultos");
                
                }
        else
            if (n>14)
        {
            System.out.println("Ingrese a cine para adolecentes");
        }
        else
            {
                System.out.println("Ingrese a cine para niños");
            }
        }
    }

