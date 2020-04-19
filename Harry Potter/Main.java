#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int count=0;int r,x,y;
  while(n!=0)
  {
    r=n%10;
    n=n/10;
    if(count==0)
    {
      x=r;
    }
    count++;
    if(count==4)
      y=r;
    else
      y=0;
  }
  cout<<x+y;
}