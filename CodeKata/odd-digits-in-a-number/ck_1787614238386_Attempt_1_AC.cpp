#include<iostream>
#include<vector>
using namespace std;

int main()
{
    int N;
    cin >> N;
    
    vector<int> v;
    bool flag = true; //assum we have all even
    
    while(N != 0)
    {
        int digit = N % 10;
        switch (digit)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                flag= false;
                v.push_back(digit);
                break;
        }
        N /= 10;
    }
    
    if(!flag)
    {
        for(int i=v.size()-1; i>=0; i--)
        {
            if(i != v.size()-1)
            {
                cout << " ";
            }
            cout << v[i];
        }
    }else{
        cout << -1;
    }
    return 0;
}