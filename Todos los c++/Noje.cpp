#include<iostream>

using namespace std;

main()
{
	int c[4][4];
	for(int i=0;i<4;i++)
	{
		cout<<endl;
		for(int j=0;j<4;j++)
		{
			cout<<"Digite un numero["<<i<<"]["<<j<<"]\n";
			cin>>c[i][j];
		}
	}
	
	cout<<endl<<"\t\t\t"<<"IMPRIMIENDO...";
	
	for(int i=0;i<4;i++)
	{	
	cout<<endl;
		for(int j=0;j<4;j++)
		{
			cout<<"["<<i<<"]["<<j<<"]\n";
			cout<<c[i][j]<<"\n";
		}
	cout<<i<<endl;
	}
	
	cout<<"Matriz respuesta"<<endl<<endl;
	
	cout<<"-------------------"<<endl;
	
	for(int i=0;i<4;i++)
	{	
		
		for(int j=0;j<4;j++)
		{
			
			if (c[i][j]<10)
			{
			cout<<c[i][j];
			cout<<"  | ";
			}
			
			else
			{
			cout<<c[i][j];
			cout<<" | ";
			}
			
		}
		cout<<endl;
		cout<<"-------------------"<<endl;
	}	
}
