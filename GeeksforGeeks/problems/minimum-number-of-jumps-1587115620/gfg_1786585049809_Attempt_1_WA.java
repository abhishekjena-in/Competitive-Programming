class Solution {
    public int minJumps(int[] arr) {
        // code here
        int iterator = 0;
        int jump_allowed = arr[0];
        int count = 0;
        
        while(true)
        {
            if(jump_allowed == 0) return -1;
            
            iterator += jump_allowed;
            if(iterator < arr.length)
            {
                jump_allowed = arr[iterator];
                count++;
            }
            else{
                count++;
                break;
            }
        }
        
        return count;
    }
}