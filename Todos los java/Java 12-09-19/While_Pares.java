
package f_de_fernando;

import java.util.Scanner;

public class While_Pares{


    public static void main(String[] args) {
       
        int num3,num4;
        
        Scanner Pichon =new Scanner(System.in);
            int num1=Pichon.nextInt();
            int num2=Pichon.nextInt();
            
            while(num2<=num1)
            {
                
                
                num3=0;
                while(num3<=11)
                {
                    
                
                System.out.println(num3);
                
                num3=num3+2;
                }
                
                num2=Pichon.nextInt();
              
            }
            while(num1<=num2)
                    {
                        num4=1;
                        
                      while (num4<=10)
                      {
                       System.out.println(num4);
                       
                       num4=num4+2;
                      }
                      num1=Pichon.nextInt();
                      
                    }
            
            
        
        
        
        
    }
    
}