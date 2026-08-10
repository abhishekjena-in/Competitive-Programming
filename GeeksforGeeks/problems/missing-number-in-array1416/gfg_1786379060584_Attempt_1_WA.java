class Solution {
    int missingNum(int arr[]) {
        // code here
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum+=arr[i];
        }
        
        int n = arr.length+1;
        int missing = (n*(n+1))/2 - sum;
        return missing;
    }
}