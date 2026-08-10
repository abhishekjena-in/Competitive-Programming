class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        // arr[], target
        ArrayList<Integer> noSubarray = new ArrayList<>();
        noSubarray.add(-1);
        
        int i=0;
        int sum=0;
        
        for(int j=0; j<arr.length; j++){
            sum = sum + arr[j];
            
            while(!(sum<=target))
            {
                sum = sum - arr[i];
                i++;
            }
            
            if(sum == target)
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(i+1);
                res.add(j+1);
                
                return res;
            }
        }
        
        return noSubarray;
        
    }
}