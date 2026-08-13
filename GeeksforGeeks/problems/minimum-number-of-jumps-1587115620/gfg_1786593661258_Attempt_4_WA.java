class Solution {
    public int search(int arr[], int x) {
        int found = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == x)
            {
                found = i;
            }
        }
        return found;
        
    }
}