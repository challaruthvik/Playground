#include<iostream>
using namespace std;
int main()
{
  float fc,fd,fs,fdp,ff;
   float sc,sd,ss,sdp,sf;
   float ac,ad,as,adp,af;
  cin>>fc>>fd>>fs>>sc>>sd>>ss>>ac>>ad>>as;
  fdp=fc*(fd/100);
  ff=(fc-fdp)+fs;
  sdp=sc*(sd/100);
  sf=(sc-sdp)+ss;
  adp=ac*(ad/100);
  af=(ac-adp)+as;
  cout<<"In Flipkart Rs."<<ff<<"\n";
    cout<<"In Snapdeal Rs."<<sf<<"\n";
    cout<<"In Amazon Rs."<<af<<"\n";
  if(ff<=sf&&ff<=af)
     cout<<"He will prefer Flipkart";
  else if(sf<af)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  

}