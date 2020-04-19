#include<iostream>
using namespace std;
int main()
{
 int x,y,res1,res2;
  
  std::cin>>x>>y;
  res1=x-3;
  res2=y-4;
	if(res1>res2)
  std::cout<<res1;
  else
    std::cout<<res2;
  return 0;
}