#include <iostream>

using namespace std;

int main() 

{

int pass, empty_seats;

cin>>pass;

pass=pass%50;

empty_seats=50-pass;

cout<<empty_seats;

return 0;
