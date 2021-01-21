
package f_de_fernando;

import java.util.Scanner;

public class Cadenas {
    
     public static void main(String[] args) {
         
         
         Scanner sc=new Scanner(System.in);
         String nombre,apellido;
         char cuco;
         cuco=' ';
         Scanner kaka=new Scanner(System.in);
         int a=kaka.nextInt();
         
         
         
         if(a<10)
         {
             
              System.out.println("Ingrese su nombre");
             nombre=sc.nextLine();
              System.out.println("Ingrese su apellido");
             apellido=sc.nextLine();
             
             System.out.println("Su nombre es: "+nombre+" apellido: "+apellido);
             
         }
         else
         {
             System.out.println("DIGITE EL CARACTER");
             Scanner lulo=new Scanner(System.in);
             cuco=lulo.next().charAt(0);
             System.out.println("Su caracter es "+cuco);
         }
         
     }
    
}
