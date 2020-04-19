#include<iostream>
int main()
{
int w,x,y,res,res1;
  
  std::cin>>w>>x>>y;
	res=w*x;
	res1=w*y+100;
  std::cout<<res-res1;
  return 0;
}