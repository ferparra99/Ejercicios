package datospersonales;
import java.awt.*;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.*;
class Datos extends Frame
{
       public Datos()
       {
           Button BtnSuma =new Button();
           Button BtnResta=new Button();
           Button BtnMulti =new Button();
           Button BtnDivi =new Button();
           
         BtnSuma.setBounds(new Rectangle(0,25,185,185));BtnSuma.setForeground(Color.black);	  BtnSuma.setLabel("Suma");	  this.add(BtnSuma,null);BtnSuma.setBackground(Color.blue);BtnSuma.setFont(new java.awt.Font("Arial",1,25));
	 BtnResta.setBounds(new Rectangle(0,370,185,185));BtnResta.setForeground(Color.black);      BtnResta.setLabel("Resta");      this.add(BtnResta,null);BtnResta.setBackground(Color.blue);BtnResta.setFont(new java.awt.Font("Arial",1,25));
         BtnMulti.setBounds(new Rectangle(370,25,185,185));BtnMulti.setForeground(Color.black);      BtnMulti.setLabel("Multiplicacion");      this.add(BtnMulti,null);BtnMulti.setBackground(Color.blue);BtnMulti.setFont(new java.awt.Font("Arial",1,25));
         BtnDivi.setBounds(new Rectangle(370,370,185,185));BtnDivi.setForeground(Color.black);      BtnDivi.setLabel("Division");      this.add(BtnDivi,null);BtnDivi.setBackground(Color.blue);BtnDivi.setFont(new java.awt.Font("Arial",1,25));
        
       }
         
         public static void main(String args[])
            {
                
            int H = 555;int V = 555;
             Datos d=new Datos();
             d.setLayout(null);
             //d.setSize(620,590);
             d.setTitle("DATOS PERSONA");
             d.setBackground(Color.white);				  
             //d.pack();
             //d.setLocationRelativeTo(null);
             d.setResizable(false);
             d.resize(H,V);
             //d.setColor(Color.blue);
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
                              if("Suma".equals(opcion))
                           { //llama a la correspondiente funcion
                              double numero1,numero2,suma;
                              String N=JOptionPane.showInputDialog("ingrese el primer numero");
                              numero1=Integer.parseInt(N);
                              String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
                              numero2=Integer.parseInt(N1);
                              suma=numero1+numero2;
                              System.out.println(suma);
                              JOptionPane.showMessageDialog(null,numero1+"  +  "+numero2+" = "+suma+"\n");			
                           } 	  
                              
                              
                              if("Resta".equals(opcion))
                           { //llama a la correspondiente funcion
                              double numero1,numero2,suma;
                              String N=JOptionPane.showInputDialog("ingrese el primer numero");
                              numero1=Integer.parseInt(N);
                              String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
                              numero2=Integer.parseInt(N1);
                              suma=numero1-numero2;
                              System.out.println(suma);
                              JOptionPane.showMessageDialog(null,numero1+"  -  "+numero2+" = "+suma+"\n");			
                           } 
                              if("Multiplicacion".equals(opcion))
                           { //llama a la correspondiente funcion
                              double numero1,numero2,suma;
                              String N=JOptionPane.showInputDialog("ingrese el primer numero");
                              numero1=Integer.parseInt(N);
                              String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
                              numero2=Integer.parseInt(N1);
                              suma=numero1*numero2;
                              System.out.println(suma);
                              JOptionPane.showMessageDialog(null,numero1+"  *  "+numero2+" = "+suma+"\n");			
                           } 
                              if("Division".equals(opcion))
                           { //llama a la correspondiente funcion
                              double numero1,numero2,suma;
                              String N=JOptionPane.showInputDialog("ingrese el primer numero");
                              numero1=Integer.parseInt(N);
                              String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
                              numero2=Integer.parseInt(N1);
                              suma=numero1/numero2;
                              System.out.println(suma);
                              JOptionPane.showMessageDialog(null,numero1+"  /  "+numero2+" = "+suma+"\n");			
                           } 
                              
                              return true;
                              
                }
             
	
       
}