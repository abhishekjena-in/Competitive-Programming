class Solution {
  public:
    vector<int> subarraySum(vector<int> &arr, int target) {
        // code here
        
        vector<int> noSubarray;
        noSubarray.push_back(-1);
        
        int i = 0;
        int sum = 0;
        
        for(int j=0; j<arr.size(); j++)
        {
            //grow the window to right
            sum = sum + arr[j];
            
            //reduce from left if invalid window
            while(sum > target)
            {
                sum = sum - arr[i];
                i++;
            }
            
            if(sum == target)
            {
                vector<int> res;
                res.push_back(i+1);
                res.push_back(j+1);
                
                return res;
            }
        }
        
        return noSubarray;
    }
};