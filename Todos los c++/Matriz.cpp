#include <iostream>

using namespace std;

main()
{
	int cantidad[4][4];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<"Digite un numero ["<<i<<"]["<<j<<"] \n";
			cin>>cantidad[i][j];
			
		}
	}

	cout<<endl<<"\t\t\t"<<"imprimiendo...";
	
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			cout<<"["<<i<<"]["<<j<<"] \n";
			cout<<cantidad [i][j]<<"\n";
		}
		cout<<i<<endl;
	}
	
	cout<<"matriz transpuesta \n"<<endl;
	for (int i=0;i<4;i++)
	{
		cout<<"............ \n";
		for(int j=0;j<4;j++)
		{
			
			if (cantidad[j][i]<10)
			{
			
		
			cout<<cantidad[j][i];
			cout<<" |";
			
			}
			else
			{
			
			cout<<cantidad[j][i];
			cout<<"|";
			}
		
		
		}
		cout<<endl;
		cout<<"............ \n";
	
	}
	
	
}







