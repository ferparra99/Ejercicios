package prueba;

import java.util.Scanner;

public class ordenarNumeros {

    public static void main(String[] args) {

        int a, b, c;

        Scanner Entrada = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros");
        a = Entrada.nextInt();
        b = Entrada.nextInt();
        c = Entrada.nextInt();

        if ((a > b) && (b > c)) {
            System.out.println("El Numero Mayor " + a);
            System.out.println("El numero medio " + b);
            System.out.println("El numero menor " + c);
        } else {
            if ((b > c) && (c > a)) {
                System.out.println("El Numero Mayor" + b);
                System.out.println("El numero medio " + c);
                System.out.println("El numero menor " + a);
            } else {
                if ((c > a) && (a > b)) {
                    System.out.println("El Numero Mayor" + c);
                    System.out.println("El numero medio " + a);
                    System.out.println("El numero menor " + b);
                } else {
                    if ((a > c) && (c > b)) {
                        System.out.println("El numero mayor " + a);
                        System.out.println("El numero medio " + c);
                        System.out.println("El numero menor " + b);
                    } else {
                        if ((b > a) && (a > c)) {
                            System.out.println("El numero mayor " + b);
                            System.out.println("El numero medio " + a);
                            System.out.println("El numero menor " + c);
                        } else {
                            if ((c > b) && (b > a)) {
                                System.out.println("El numero mayor " + c);
                                System.out.println("El numero medio " + b);
                                System.out.println("El numero menor " + a);
                            }
                        }
                    }

                }
            }
        }
    }
}
