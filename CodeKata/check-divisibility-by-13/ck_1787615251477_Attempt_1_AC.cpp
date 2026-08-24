#include<iostream>
using namespace std;

int main()
{
    int N;
    cin >> N;
    
    if(N%13 == 0)
    {
        cout << "yes\n";
    }else{
        cout << "no\n";
    }
    return 0;
}