#include <iostream>

using namespace std;

void menu();
void f1();
void f2();
void f3();
void f4();
void f5();
void f6();
void f7();

void menu()
{
	cout<<"elija que operacion va a ejecutar \n";
	
	cout<<"1) resta de flotables \n";
	cout<<"2) tabla de multiplicar \n";
	cout<<"3) Hago hasta que sea N \n";
}

void f1()
{


	float a,b,c;
	cout<<"Resta \n";
	cout<<"ingrese numero \n";
	cin>>a;
	cout<<"ingrese otro numero \n";
	cin>>b;
	
	c=a-b;
	
	cout<<"la resta es: "<<c;

}

void f8()
{
	int a,b,r;
	a=1;
	b=1;
	
	for (a=1;a<11;a++)
	{
	
			for (b=1;b<11;b++)
		{
	
	
		r=a*b;
	
		cout<<a<< " x "<<b<<" = "<<r;
		cout<<endl;
		}
			cout<<"-------------------------------------";
	cout<<endl;

	
	}
}

void f3()
{
	
	char a;
	
	
	do 
	{

	
	cout<<"haga mientras";
	cout<<endl;

	cin>>a;
	}	
	while (a!='N');
	
}
void f2()
{
	int a,b,c;
	cin>>a;
	cout<<"***********";
	cout<<endl;
	
	if ((a%2)==0)
	{
		for(b=1;b<=30;b++)
		{
		
			b=b+1;
			
			cout<<b;
			cout<<endl;
			
			}
	}
	else
	{
		for(c=1;c<=10;c++)
		{
			
			cout<<"no soy par";
			
			cout<<endl;
			
		}
	}
	
}

main()
{

menu();

cout<<"**********************************";
cout<<endl;

int a=0;
cin>>a;
	cout<<"***********";

	switch(a)
	{

	
		case 1:
	
				
			f1();
		break;
		
		case 2:
	
				
			f2();
		break;
		
		case 3:
	
				
			f3();
		break;
				
		default:
	
		cout<<"Estoy saliendo";

	}
	

}
