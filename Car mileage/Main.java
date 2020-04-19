#include<iostream>
using namespace std;
int main()
{
  float m,mm;
  int p,d;
  cin>>m>>p>>d;
  mm=m*p;
  if(mm>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}