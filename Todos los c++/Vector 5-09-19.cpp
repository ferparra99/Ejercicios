#include <iostream>

using namespace std;

main()
{
	string matriz1[5][5]={{"   ","C1"	,"C2	","C3	",},{"F1 ","Pedro	","Juan","	Jose "},{"F2 ","Ana	","Rocio	","	Prima"},{"F3 ","Victor	","Pedro","	Mila"},{"F4 ","Juliana	","Adeiana","	Rosana"}};
	
	
	
	for (int a=0;a<=4;a++)
	{
		
		cout<<endl;
		for(int b=0;b<=4;b++)
		{
			cout<<matriz1[a][b];
		}
	}
	
	cout<<endl;
	cout<<endl;
	cout<<endl;
	
	char matriz2[3][3];
		 matriz2[0][3]='P';
		 matriz2[1][1]='L';
		 matriz2[2][2]='O';
		 
	for (char a=0;a<=2;a++)
	{
		cout<<endl;
		for(char b=0;b<=2;b++)
		{
			cout<<matriz2[a][b];
		}
	}	
}
