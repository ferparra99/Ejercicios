#include<iostream>
#include<windows.h>
#include<locale.h>

using namespace std;

main()
{
	setlocale(LC_ALL, "");
	cout<<"\t\t\t      BIENVENIDO \n\n\n";
	
	char  mensaje[]={'P','R','O','G','R','A','M','A','C','I','Ó','N',' ','D','E',' ','S','O','F','T','W','A','R','E'};cout<<"          \t\t";
	
	for (int a=0;a<=25;a++)
	{
		cout<<mensaje[a];
		Sleep (80);
	}
	cout<<"\n\n\n \t\t\t PROGRAMA FINALIZADO \n\n\n";
}
