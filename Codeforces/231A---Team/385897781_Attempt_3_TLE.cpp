#include<iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int arr[3];

    int totalSubs;
    for(int i=1; i<=n; i++)
    {
        int count;
        for(int j=0; i<3; j++)
        {
            cin >> arr[i];
            if(arr[i] == 1)
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