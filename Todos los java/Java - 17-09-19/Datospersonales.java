package datospersonales;
import java.awt.*;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.*;
class Datospersonales extends Frame
{  
           Button BtnLimp = new Button();
           Button BtnMod =new Button();
           //List  ListGen,LtipDoc, Lbar;     
   public Datospersonales()
	{ //titulo1 = new Label("GESTION Y SEGUIMIENTO DE APRENDICES",Label.CENTER);
                 
             //crear objetos con el operador new:
            Button BtnPri =new Button();Button BtnAnt =new Button();Button BtnSte =new Button();
            Button BtnUlt =new Button();Button BtnNue =new Button();Button BtnMod =new Button();
            Button BtnEli =new Button();Button BtnRen =new Button();Button BtnBus =new Button();
            Button BtnExp =new Button();Button BtnImp =new Button();Button BtnCan =new Button();
            Button BtnSal =new Button();
            //Button BtnLimp =new Button();

          
	 BtnRen.setBounds(new Rectangle(25,50,80,25));BtnRen.setForeground(Color.white);      BtnRen.setLabel("SUMA");      this.add(BtnRen,null);BtnRen.setBackground(Color.darkGray);BtnRen.setFont(new java.awt.Font("Arial",1,12));
         BtnBus.setBounds(new Rectangle(25,200,80,25));BtnBus.setForeground(Color.white);      BtnBus.setLabel("RESTA");      this.add(BtnBus,null);BtnBus.setBackground(Color.darkGray);BtnBus.setFont(new java.awt.Font("Arial",1,12));
         BtnExp.setBounds(new Rectangle(180,50,80,25));BtnExp.setForeground(Color.white);      BtnExp.setLabel("MULTI");      this.add(BtnExp,null);BtnExp.setBackground(Color.darkGray);BtnExp.setFont(new java.awt.Font("Arial",1,12));
         BtnImp.setBounds(new Rectangle(180,200,80,25));BtnImp.setForeground(Color.green);      BtnImp.setLabel("DIVI");      this.add(BtnImp,null);BtnImp.setBackground(Color.darkGray);BtnImp.setFont(new java.awt.Font("Arial",1,12));

	//BtnLimp.setFont(new java.awt.Font("Dialog",1,16));  
    } 
	//principal
           public static void main(String args[])
            {   
             
              int H = 320;int V = 290;
             Datospersonales d=new Datospersonales();
             d.setLayout(null);
             //d.setSize(620,590);
             d.setTitle("DATOS PERSONALES");
             d.setBackground(Color.BLUE);				  
             //d.pack();
             //d.setLocationRelativeTo(null);
             d.setResizable(false);
             d.resize(H,V);
             //d.setColor(Color.blue);
             d.show();	
            } 
	             //cerrar la ventana con la x del formulario
           public boolean handleEvent(Event e)
               { 
               if (e.id == Event.WINDOW_DESTROY)
                  System.exit(0);
                  return super.handleEvent(e);        
               }  
                 //Cada vez que el usuario pulsa un botón, se produce un evento. 
            	   //Los eventos de pulsación de un botón se pueden capturar sobrecargando el método action():         
          public boolean action(Event evt, Object arg)
               { 
                    		   				   		
                    if (evt.target instanceof Button)
                       {
                          String opcion=(String)arg;   		
                         
                      
                           {  //llama a la correspondiente funcion
                              //removeAll();
                              //setVisible(false);
                              //System.exit(0);
                              //JOptionPane.showConfirmDialog(null, "Realmente desea salir de Hola Swing?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                           int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?");
                           switch (confirmar) 
                              {
                              case JOptionPane.CANCEL_OPTION:
                                 JOptionPane.showMessageDialog(null,"no sales");
                                 break;
                              case JOptionPane.NO_OPTION:
                                 JOptionPane.showMessageDialog(null,"te has quedado");
                                 break;
                              default:
                                 System.exit(0);
                              }    
                           }
                        
                        if(opcion=="NUEVO")
                           { 	
                                  this.potencia();
                           } 
                        if(opcion=="PRIMERO")
                           { 	
                                  this.imprimir();
                           } 
                        if("ANTERIOR".equals(opcion))
                           { 	
                                  this.chingo();
                           } 
                        if(opcion=="CANCELAR")
                           { 	//llama a la correspondiente funcion
                                  JOptionPane.showMessageDialog(null,"Oprimiste Cancelar");
                            //DatosPersonales1 Prueba=new DatosPersonales1();	  
                                  Datospersonales d=new Datospersonales();
                             //this.DatosPersonales1();          	  
                           }    
                        if("BUSCAR".equals(opcion))
                           { //llama a la correspondiente funcion
                              int numero1,numero2,suma;
                              String N=JOptionPane.showInputDialog("ingrese el primer numero");
                              numero1=Integer.parseInt(N);
                              String N1=JOptionPane.showInputDialog("ingrese el segundo numero");
                              numero2=Integer.parseInt(N1);
                              suma=numero1+numero2;
                              System.out.println(suma);
                              JOptionPane.showMessageDialog(null,numero1+"  mas  "+numero2+" = "+suma+"\n");			
                           }           	  
                       }
                if (evt.target instanceof Checkbox)
                  { 	
                       	
                  }            
                  return true; 
               }//fin action
	
       private static void potencia()
         {
            double  x,y,z;  
            String N=JOptionPane.showInputDialog("ingrese el numero");
            x=Double.parseDouble(N);
            String N1=JOptionPane.showInputDialog("ingrese la potencia");
            y=Double.parseDouble(N1); 
            z = Math.pow(x, y); 
            JOptionPane.showMessageDialog(null,x+"  Elevado a la  "+y+" = "+z+"\n");
            System.out.println(z); 
         }        
	private static void tablas()
		    {	int numero1,numero2,resultado;
			String N=JOptionPane.showInputDialog("¿Cual tablita de multiplicar quieres ver?");
			numero2=Integer.parseInt(N);
                      for(numero1=1;numero1<=10;numero1++)
                         { 
                         resultado=numero1*numero2;
                         System.out.println(resultado);
                         JOptionPane.showMessageDialog(null,numero1+"  x  "+numero2+" = "+resultado+"\n");
                         }
                    }
       public void chingo() 
       {
         String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);
        //Pasamos el codigo a caracter
        char caracter=(char)codigo;
        JOptionPane.showMessageDialog(null,caracter);
        //System.out.println(caracter);
       }
//Se desea guardar los sueldos de 5 operarios en un vector. 
//Realizar la creación y carga del vector en el constructor.
    public void imprimir() 
      {       
         for(int x=1;x<=15;x++) 
            {   
               if(x%2==0)
                  {
                   JOptionPane.showMessageDialog(null,x+"  :  es par");  
                   if(x==4)
                     {
                        JOptionPane.showMessageDialog(null,"Estoy en Cuatro"); 
                     }
                  }  
               else
                  {
                   JOptionPane.showMessageDialog(null,x+"  :  es impar");   
                  }
            }	
      }
    
    public void ventana() 
      {	
         Object color = JOptionPane.showInputDialog(null,"Seleccione Un Color",
         "COLORES", JOptionPane.QUESTION_MESSAGE, null,
         new Object[] 
         { 
            "Seleccione","Amarillo", "Azul", "Rojo" 
         },"Seleccione");                
      }
    


    
    
    
} 