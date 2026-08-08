class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> tempV;
        for(int i=0; i<nums.size(); i++)
        {
            tempV.push_back(nums[i]);
        }
        for(int i=0; i<tempV.size(); i++)
        {
            if(i+k > nums.size()-1)
            {
                nums[(i+k) % nums.size()] = tempV[i];
            }else{
                 nums[i+k] = tempV[i];
            }
        }
    }
};