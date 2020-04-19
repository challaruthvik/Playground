#include<iostream>
using namespace std;
int main()
{
 int tw,a,c,ta,tc,fw;
  cin>>tw>>a>>c;
  ta=a*75;
  tc=c*30;
    fw=ta+tc;
    if(fw<=tw)
      cout<<"Boat is stable";
  else
    cout<<"Boat will drow";


}