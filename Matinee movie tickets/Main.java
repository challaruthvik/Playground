#include<iostream>
using namespace std;
int main()
{
 int age;
  float time,mat=13.30;
  cin>>age>>time;
  if(time==mat && age >=13 )
  	cout<<"$5.00";
  else if(time == mat && age<13)
    cout<<"$2.00";
  else 
  {
  if( age >=13)
    cout<<"$8.00";
    else
      cout<<"$4.00";
  }
  
}