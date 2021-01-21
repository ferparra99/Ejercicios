package prueba;

import java.util.Scanner;

public class ingresandoDatos {
    
    public static void main(String[] args) {
        
        int n1,n2,n3,n4,n5,n6,n7,n8,n9;
        double n10,n11,n12;
        
        Scanner Entrada = new Scanner(System.in);
                
                System.out.println("Operadores");
                System.out.println("Suma");
                System.out.println("Ingrese el primer numero");
                n1=Entrada.nextInt();
                System.out.println("Ingrese el segundo numero");
                n2=Entrada.nextInt();
                n3=n1+n2;
                System.out.println("El resultado es: "+n3);
                System.out.println("Resta");
                System.out.println("Ingrese el primer numero");
                n4=Entrada.nextInt();
                System.out.println("Ingrese el segundo numero");
                n5=Entrada.nextInt();
                n6=n4-n5;
                System.out.println("El resultado es: "+n6);
                System.out.println("Multiplicacion");
                System.out.println("Ingrese el primer numero");
                n7=Entrada.nextInt();
                System.out.println("Ingrese el segundo numero");
                n8=Entrada.nextInt();
                n9=n7*n8;
                System.out.println("El resultado es: "+n9);
                System.out.println("Division");
                System.out.println("Ingrese el primer numero");
                n10=Entrada.nextDouble();
                System.out.println("Ingrese el segundo numero");
                n11=Entrada.nextDouble();
                n12=n10/n11;
                System.out.println("El resultado es: "+n12);
        
    }    
}
