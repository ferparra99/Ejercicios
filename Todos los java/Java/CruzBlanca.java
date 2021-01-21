package cruzblanca;

import java.awt.*;
import javax.swing.*;

public class CruzBlanca extends Frame{

       
   
        public CruzBlanca()
        {
            Button BtnSum =new Button();
            Button BtnRes =new Button();
            Button BtnMul =new Button();
            Button BtnDiv =new Button();    
            
            BtnSum.setBounds(new Rectangle(0,0,185,185))  ;BtnSum.setForeground(Color.white);	 BtnSum.setLabel("SUMA");
            this.add(BtnSum,null);BtnSum.setBackground(Color.blue);BtnSum.setFont(new java.awt.Font("Arial",1,12));
            BtnRes.setBounds(new Rectangle(370,0,185,185))  ;BtnRes.setForeground(Color.white);   BtnRes.setLabel("RESTA");
            this.add(BtnRes,null);BtnRes.setBackground(Color.blue);BtnRes.setFont(new java.awt.Font("Arial",1,12));
            BtnMul.setBounds(new Rectangle(0,370,185,185))  ;BtnMul.setForeground(Color.white);	 BtnMul.setLabel("MULTIPLICACION");
            this.add(BtnMul,null);BtnMul.setBackground(Color.blue);BtnMul.setFont(new java.awt.Font("Arial",1,12));
            BtnDiv.setBounds(new Rectangle(370,370,185,185))  ;BtnDiv.setForeground(Color.white);	 BtnDiv.setLabel("DIVIDIR");
            this.add(BtnDiv,null);BtnDiv.setBackground(Color.blue);BtnDiv.setFont(new java.awt.Font("Arial",1,12));
        }
    public static void main(String[] args) {
     
         int H = 555;int V = 555;
             CruzBlanca d=new CruzBlanca();
             d.setLayout(null);
             d.setBackground(Color.white);				  
        
             d.setResizable(false);
             d.resize(H,V);
             d.show();	
        
    }
     public boolean handleEvent(Event e)
               { 
               if (e.id == Event.WINDOW_DESTROY)
                  System.exit(0);
                  return super.handleEvent(e);        
               }  
    public boolean action(Event evt, Object arg)
    {
        String opcion=(String)arg;
        if("SUMA".equals(opcion))
        { 
           int numero1,numero2,suma;
           String N=JOptionPane.showInputDialog("ingrese el primer numero");
           numero1=Integer.parseInt(N);
           String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
           numero2=Integer.parseInt(N1);
           suma=numero1+numero2;
           System.out.println(suma);
           JOptionPane.showMessageDialog(null,numero1+"  mas  "+numero2+" = "+suma+"\n");			
        }
        if("RESTA".equals(opcion))
        { 
           int numero1,numero2,R;
           String N=JOptionPane.showInputDialog("ingrese el primer numero");
           numero1=Integer.parseInt(N);
           String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
           numero2=Integer.parseInt(N1);
           R=numero1-numero2;
           System.out.println(R);
           JOptionPane.showMessageDialog(null,numero1+"  menos  "+numero2+" = "+R+"\n");			
        }
        if("MULTIPLICACION".equals(opcion))
        { 
           int numero1,numero2,M;
           String N=JOptionPane.showInputDialog("ingrese el primer numero");
           numero1=Integer.parseInt(N);
           String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
           numero2=Integer.parseInt(N1);
           M=numero1*numero2;
           System.out.println(M);
           JOptionPane.showMessageDialog(null,numero1+"  por  "+numero2+" = "+M+"\n");			
        }
        if("DIVIDIR".equals(opcion))
        { 
           double numero1,numero2,D;
           String N=JOptionPane.showInputDialog("ingrese el primer numero");
           numero1=Integer.parseInt(N);
           String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
           numero2=Integer.parseInt(N1);
           D=numero1/numero2;
           System.out.println(D);
           JOptionPane.showMessageDialog(null,numero1+"  dividido en  "+numero2+" = "+D+"\n");			
        }           
    
    
    return true;
    }
}