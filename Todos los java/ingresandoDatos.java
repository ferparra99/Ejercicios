/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinicio;

import java.util.Scanner;

public class ingresandoDatos {
    
    
    public static void main (String[]args)
    {
        int n1,n2,n3,resultado;
        int r1,r2,r3,rt;
        int m1,m2,m3,mt;
        double d1,d2,d3,dt;
        
            Scanner Entrada=new Scanner(System.in);
            System.out.println("Ingrese le primer numero");
                    n1=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    n2=Entrada.nextInt();
                    resultado=n1+n2;
                    
                    System.out.println("La suma es: "+resultado);
                   System.out.println("\n\n");
            
     
            System.out.println("Ingrese le primer numero");
                    r1=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    r2=Entrada.nextInt();
                    rt=r1-r2;
                    
                    System.out.println("La resta es: "+rt);
                    
                    System.out.println("\n\n");
                    
            System.out.println("Ingrese le primer numero");
                    m1=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    m2=Entrada.nextInt();
                    mt=m1*m2;
                    
                    System.out.println("La multiplicacion es: "+mt);
                    
                    System.out.println("\n\n");
                    
            System.out.println("Ingrese le primer numero");
                    d1=Entrada.nextDouble();
            System.out.println("ingrese el segundo numero");
                    d2=Entrada.nextDouble();
                    dt=d1/d2;
                    
            System.out.println("La Division es: "+dt);
    }
    
}
