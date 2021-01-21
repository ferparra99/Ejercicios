#include<iostream>

	using namespace std;
		
		main()
	{
		
		int cedula;
			
			cout<<"programa para analizar eñ ingreso a cine \n";
			cout<<"Bienvenido a cinecolombia  \n";
			cout<<"para ingresarpresente su cedula e ingrese el numero \n";
				cin>>cedula;
			
				if (cedula>=18)
				{
					cout<<"ingrese a cine adulto \n";
				}
				else if (cedula<=0)
				
				{
					cout<<"No ha nacido \n";
				}
				else
				{
					cout<<"ingrese a cine para menores \n";
				}
	}
