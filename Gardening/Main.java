#include<iostream>
using namespace std;
int main()
{
   int rows,col,tn,f;
  cin>>rows>>col>>tn;
    
  if(tn<=rows*2 && tn>=rows)
    cout<<"It is a mango tree";
  else if(tn<=rows*(col-1) && tn>=col*3 )
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}