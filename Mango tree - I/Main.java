#include<iostream>
using namespace std;
int main()
{
 int row,col,tn;
  cin>>row>>col>>tn;
  if(tn<=row)
    cout<<"Yes";
    else if (tn == 8)
      cout<<"No";
  else if(tn==(row+1) || tn==(row+5) || tn==(row+6) || tn==(row+10) || tn==(row+11))   
    cout<<"Yes";

  else
    cout<<"No";
}