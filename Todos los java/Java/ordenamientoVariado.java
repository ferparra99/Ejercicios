package prueba;

import java.util.Scanner;

public class ordenamientoVariado {
    public static void main(String[] args) {
        int ca,i,j,f,c,a;
        int v[] = new int[50];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de elementos a ingresar: \n");
        ca=entrada.nextInt();
        for(i=1;i<=ca;i++)
        {
            System.out.println("Ingrese el numero en el indice del vector "+i+" ");
            v[i]=entrada.nextInt();
        }
        for(f=1;f<=ca-1;f++)
        {
            for(c=1;c<=ca-1;c++)
            {
                if(v[c]>v[c+1])
                {
                    a=v[c];
                    v[c]=v[c+1];
                    v[c+1]=a;
                }
            }
        }
        System.out.println("Ascendente");
        for(i=1;i<=ca;i++)
        {
            System.out.println(" "+v[i]);
        }
        System.out.println("Descendente");
        for(i=ca;i>= 1;i--)
        {
            System.out.println(" "+v[i]);
        }
    }
}
