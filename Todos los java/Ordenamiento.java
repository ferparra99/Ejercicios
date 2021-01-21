
package proyectoinicio;

import java.util.Scanner;


public class Ordenamiento {
    
    public static void main (String[]args)
    {
     
        int n1,n2,n3;
    Scanner Entrada=new Scanner(System.in);
    
    System.out.println("Ingrese le primer numero");
                    n1=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    n2=Entrada.nextInt();
            System.out.println("ingrese el segundo numero");
                    n3=Entrada.nextInt();
                    
                    
         if ((n1>n2)&&(n2>n3))
            {
                System.out.println(n1);
                System.out.println(n2);
                System.out.println(n3);
            }
            else
            {
               if ((n2>n3)&&(n3>n1))
                {
                    System.out.println(n2);
                    System.out.println(n3);
                    System.out.println(n1);
                }
                else
                {
                    if ((n3>n1)&&(n1>n2))
                    { 
                    System.out.println(n3);
                    System.out.println(n1);
                    System.out.println(n2);
                }
                    else
                    {
                         if ((n1>n3)&&(n3>n2))
            {
                System.out.println(n1);
                System.out.println(n3);
                System.out.println(n2);
            }
            else
            {
               if ((n2>n1)&&(n1>n3))
                {
                    System.out.println(n2);
                    System.out.println(n1);
                    System.out.println(n3);
                }
                else
                {
                    if ((n3>n2)&&(n2>n1))
                    { 
                    System.out.println(n3);
                    System.out.println(n2);
                    System.out.println(n1);
                }
                    }
            }
                    }
                }
            }
                    
                    
                    
    }
}
