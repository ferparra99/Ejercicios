#include <iostream>

using namespace std;
	main()
{
		
int n1,n2,n3;
		
	cout<<"programa para ingresar 3 numeros e imprimirlos en orden \n";
	cout<<"ingrese su primer nuemro \n";
	cin>>n1;
	cout<<"ingrese su primer segundo \n";
	cin>>n2;
	cout<<"ingrese su tercer nuemro \n";
	cin>>n3;
				
	if ((n1==n2)&&(n2==n3)&&(n1==n3))
	{
			
	cout<<"todos los numeros son iguales \n";
	}
	else
	{
			
				
	if ((n1>n2)&&(n2>n3))
	{
	cout<<"\n el mayor es el numero: \n"<<n1;
	cout<<"\n el medio es el numero: \n"<<n2;
	cout<<"\n el menor es el numero: \n"<<n3;
	}
	else if ((n2>n1)&&(n1>n3))
					{
	cout<<"\n el mayor es el numero: \n"<<n2;
	cout<<"\n el medio es el numero: \n"<<n1;
	cout<<"\n el menor es el numero: \n"<<n3;
	}
	else if ((n3>n2)&&(n2>n1))
	{
	cout<<"\n el mayor es el numero: \n"<<n3;
	cout<<"\n el medio es el numero: \n"<<n2;
	cout<<"\n el menor es el numero: \n"<<n1;
	}
	else if ((n1>n3)&&(n3>n2))
	{
	cout<<"\n el mayor es el numero: \n"<<n1;
	cout<<"\n el medio es el numero: \n"<<n3;
	cout<<"\n el menor es el numero: \n"<<n2;
					
	}	
	}
				
	}
