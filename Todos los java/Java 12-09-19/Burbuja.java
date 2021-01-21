
package f_de_fernando;


public class Burbuja {
    
     public static void main(String[] args) {
         
         
         int vector[]= new int[5];
         int auxiliar;
                  
         
         
         vector[1]=5;
         vector[2]=4;
         vector[3]=3;
         vector[4]=2;
         vector[5]=1;
         
         System.out.println("Llamado de vectores \n");
         
         for(int i=0;i<=5;i++)
        {
            System.out.println(vector[i]);
        }
         
                for(int i=0;i<=5;i++)
                {
                    
                    for(int a=0;a<=5;a++)
                        {
                            if(vector[a]>vector[a+1])
                            {
                               auxiliar=vector[a];
                               vector[a]=vector[a+1];
                               vector[a+1]=auxiliar;
                            }   
                            
                        }
                }
         
         System.out.println("imprimendo los numeros del vector de forma ascendente");   
                 
         for(int i=0;i<=5;i++)
        {
            System.out.println("Posicion: "+i+" es: "+vector[i]);
        }
         
     }
        
         
    
}
