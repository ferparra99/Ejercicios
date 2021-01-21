package andres;

import java.util.Scanner;

public class charPrueba {
    
     public static void main(String[] args) {

    
        Scanner cuco = new Scanner(System.in);

        char c;
        c=' ';

        System.out.println("digite el caracter");  
    
        c=cuco.next().charAt(0);
        System.out.println("Su caracter es: "+c);
}
     
}