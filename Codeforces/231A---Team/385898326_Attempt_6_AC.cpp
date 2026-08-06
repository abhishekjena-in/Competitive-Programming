#include<iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[3];

    int totalSubs = 0;
    for(int i=1; i<=n; i++)
    {
        int count = 0;
        for(int j=0; j<3; j++)
        {
            cin >> arr[j];
            if(arr[j] == 1)
            {
                count++;
            }
        }
        if(count >= 2)
        {
            totalSubs++;
        }
    }
    cout << totalSubs;
    return 0;
}