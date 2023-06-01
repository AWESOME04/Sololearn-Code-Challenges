#include <iostream>
using namespace std;

int main()
{
    int n;
    cin>>n;
    for (int a = n; a >0; a--) {
        cout << a << endl;
     if(a%5==0)
        {
            cout<<"Beep"<<endl;
        }
        }

    return 0;
}
