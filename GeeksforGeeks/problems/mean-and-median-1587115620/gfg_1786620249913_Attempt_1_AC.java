class Solution {
    public int mean(int[] arr) {
        // code here
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        
        return sum/arr.length;
    }

    public int median(int[] arr) {
        // code here
        Arrays.sort(arr);
        if(arr.length%2 != 0)
        {
            return arr[arr.length/2];
        }else{
            int median1 = arr.length/2 -1;
            int median2 = arr.length/2;
            int ans = (arr[median1] + arr[median2])/2;
            return ans;
        }
        
    }
}