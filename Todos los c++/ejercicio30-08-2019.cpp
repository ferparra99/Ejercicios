//NUMEROS PARES ENTER 10 Y 20,SI ES UN NUMERO DISTINTO SOLICITAR AREA DEL TRANGULO//

#include <iostream>
#include <conio.h>
using namespace std;
main ()


{
		
		int a,b,c,d,e,f,m,y,z;
		double g,h,i;
		cout<<"ingrese un numero\n ";
		cin>>a;
		if ((a>10) && (a<=20))
		
		
		
		{
			c=0;
			for(b=0;b<=10;b=b+2)
			c=c+b;
		
			cout<<"la suma de los numeros pares de 0 a 10 es:\n"<<c;
			}
			
			
			else if (a==5)
			{
			
			cout<<"ingrese 2 numeros para sumarlos \n";
			cin>>b;
			cin>>c;
			d=b+c;
			cout<<"la suma de los numeros es: \n"<<d;
			cout<<endl;
				if ((b=7) or (c=7))
			{
				while (m<20)
				{
					m=10;
					for 	(m==10;m<20;m++)
					{
						m=m+1;
						cout<<m;
						cout<<endl;
					}
				}
			}
	getch();
	}	
			
				else if (a!=5)
			{
			
			cout<<"digite la base del triangulo";
cin>>g;
cout<<"digite la altura del triaungulo";
cin>>h;
i=(g*h)/2;
cout<<"el resultado de la base del triangulo es"<<i;

		}
	}
	
