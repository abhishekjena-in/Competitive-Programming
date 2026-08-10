class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        
        long n = arr.length+1;
        long missing = (n*(n+1))/2 - sum;
        return (int)missing;
    }
}