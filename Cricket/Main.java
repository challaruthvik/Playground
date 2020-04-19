#include<iostream>
#include<cmath>
#include <iomanip>
using namespace std;
int main()
{
int tb,tr,rs,bb;
  float to,of,cr,trr;
  cin>>tb>>tr>>rs>>bb;
  to=tb/6;
  of=bb/6+(bb%6)/10.0;
  cr=(float)rs/of;
  trr=(float)tr/50;
  cout<<to<<"\n";
   cout<<of<<"\n";
  
  if(cr>10)
   cout<<setprecision(3)<<cr<<"\n";
  else
   cout<<setprecision(2)<<cr<<"\n";
   cout<<setprecision(2)<<trr<<"\n";
  if(trr<cr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}