#include<iostream>
using namespace std;
int main()
{
 int n;
  float sh,tt;
  cin>>n>>sh;
  if(n==1)
    cout<<sh;
  else if(n==2)
  {
    tt=sh*0.5;
    cout<<tt+sh;
  }
  else if(n==3)
    cout<<sh+sh;
  else
    cout<<"Number of items is more";
    
    
  
}