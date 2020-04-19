#include<iostream>
int main()
{
  int maxwe,wf;
  std::cin>>maxwe>>wf;
  if(maxwe>wf)
    std::cout<<"Yes, you can enter.";
  else if(maxwe==wf)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}