#include<iostream>
using namespace std;
int main()
{
 int dob,cr,y;
   cin>>dob>>cr;
 y= (100-dob)+cr;
  if(y>100)
    cout<<y-100;
  else
  cout<<y;
}