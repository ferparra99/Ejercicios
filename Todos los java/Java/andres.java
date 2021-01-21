package andres;

import java.util.Scanner;

public class andres{


    public static void main(String[] args) {
        
        Scanner pichon = new Scanner(System.in);
      
        int n1,n2,a,b;
        
        System.out.println("Ingrese 2 numeros");   
        n1=pichon.nextInt();
        n2=pichon.nextInt();
        
          
        if (n2<n1)
        {
            a=1;
            System.out.println("Vienen los impares");
            while (a<=9)
                    {
                        System.out.println(a);
                        a=a+2;
                    }
            
        }
        else
        {
            b=0;
            System.out.println("V    s");
            while (b<=10)
                    {
                        System.out.println(b);
                        b=b+2;    
                    }
         }
             
         }
        }
    

