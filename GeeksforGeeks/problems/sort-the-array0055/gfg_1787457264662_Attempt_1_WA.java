class Solution {
    void sortArr(int[] arr) {
        int len = arr.length;
        for(int i=0; i<len-1; i++)
        {
            int minInd = i;
            for(int j=i+1; j<len; j++)
            {
                if(arr[j] < arr[minInd])
                {
                    minInd = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
    }
}