#include<iostream>
using namespace std;

int main(){
    int userInput;
    cin >> userInput;
    
    if(userInput <= 2)
    {
        cout << "NO";
    }
    
    if(userInput > 2 && userInput%2 == 0)
    {
        cout << "YES";
    }
    return 0;
}