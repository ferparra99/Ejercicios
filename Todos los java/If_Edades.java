/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinicio;

import java.util.Scanner;

public class If_Edades {
    
    public static void main (String[]args)
    {
        int n1;
        
        System.out.println("Ingrese su edad");
        Scanner Entrada=new Scanner(System.in);
        n1=Entrada.nextInt();
        
        if (n1>=17)
        {
            System.out.println("Entre a cine adultos");
        }
        else
        {
           if (n1>=14)
            {
                System.out.println("Entre a cine adolententes 7u7");
            }
            else
            {
                System.out.println("Entre a cine pa chinitos");
            }
        }
            
        
    }
}
