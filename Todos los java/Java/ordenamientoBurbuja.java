
package andres;

import java.util.Arrays;

public class ordenamientoBurbuja {

    public static void main(String[] args) {
        
        int a,b,c;
        int p[] = new int[5];
        
        p[1]=54;
        p[5]=4;
        p[2]=5;
        p[3]=74;
        p[4]=56;
        
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=5;b++)
            {
                if (p[b]>p[b+1])
                {
                    c=p[b];
                    p[b]=p[b+1];
                    p[b+1]=c;
                }
            }
            System.out.println(p[a]);
        }
        for(a=1;a<=5;a++)
        {
            System.out.println("Posicion "+a+" es "+p[a]);
        }
        
    }
    
}
