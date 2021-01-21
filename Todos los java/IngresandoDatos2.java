/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinicio;

import java.util.Scanner;

public class IngresandoDatos2 {
    
    
    public static void main (String[]args)
    {
        int n1,n2,resultado;
        
        
            Scanner Entrada=new Scanner(System.in);
            System.out.println("Ingrese le primer numero");
                    n1=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    n2=Entrada.nextInt();
                    resultado=n1+n2;
                    
                    System.out.println("La suma es: "+resultado);
                   System.out.println("\n\n");
            
    byte numero=127;
    long numero1=33333;
    int numero2=5123456;
    short numero3=3545;
    double numero4=654321;
    float numero5=54321;
    
    
           System.out.println("BYTE "+numero);
           System.out.println("Long "+numero1);
           System.out.println("Int "+numero2);
           System.out.println("Short "+numero3);
           System.out.println("double "+numero4);
           System.out.println("float "+numero5);
    }
    
}