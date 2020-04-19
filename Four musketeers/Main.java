#include<iostream>
using namespace std;
int main()
{
  float x1,y1,x2,y2,x3,y3;
  float f1,f2;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  f1=(x1+x2+x3)/3;
    f2=(y1+y2+y3)/3;
   std::cout<<f1<<"\n"<<f2;
  return 0;
}