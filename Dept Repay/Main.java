#include<iostream>
int main()
{
int p,t,r;
  float ff,fin,dis,in;
  
  std::cin>>p>>t>>r;
	in=(p*t*r)/100;
	ff=in+p;
	dis=in*2/100;
	fin=ff-dis;
  std::cout<<in<<"\n";
   std::cout<<ff<<"\n";
   std::cout<<dis<<"\n";
  std::cout<<fin;
  return 0;
}