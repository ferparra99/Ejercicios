
package f_de_fernando;

import java.util.Scanner;

public class F_de_Fernando {


    public static void main(String[] args) {
       
        
        Scanner Pichon =new Scanner(System.in);
            int num1=Pichon.nextInt();
            int num2=Pichon.nextInt();
            
            while(num2<=num1)
            {
                System.out.println("Error el segundo numero tiene que ser mayor que el primero");
                num2=Pichon.nextInt();
                
            }
            while(num2<=num1)
                    {
                       System.out.println(num1);
                       num1++;
                    }
            
            
        
        
        
        
    }
    
}
