#include<iostream>
#include<string>
using namespace std;

int main()
{
    int n;
    cin >> n;
    
    for(int i=1; i<=n; i++)
    {
        string userInput;
        cin >> userInput;
        int len = userInput.length();
        
        if(len<10)
        {
            cout << userInput;
        }
        else
        {
            cout << userInput[0] << len-2 << userInput[len];
        }
    }
    return 0;
}