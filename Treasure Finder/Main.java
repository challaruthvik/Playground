#include<iostream>
using namespace std;
int main()
{
   int a,b,c,hcf,st;
	cin>>a>>b>>c;
 
 	st=a<b?(a<c?a:c):(b<c?b:c);
 
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
            cout<<"The treasure is in box which has number "<<b<<"\n";
        }
        else
        {
           cout<<"The treasure is in box which has number "<<c<<"\n";
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            cout<<"The treasure is in box which has number "<<a<<"\n";
        }
        else
        {
            cout<<"The treasure is in box which has number "<<c<<"\n";
        }
    }

  
    else if(a >= b)
    
       cout<<"The treasure is in box which has number "<< a<<"\n";
    
    else
    {
        cout<<"The treasure is in box which has number "<< b<<"\n";
    }
    
	cout<<"The code to open the box is "<<hcf;
}