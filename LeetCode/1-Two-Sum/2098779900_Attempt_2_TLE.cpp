class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        int i=0;
        int j=1;
        while(i <= nums.size()-2)
        {
            if(nums.at(i) + nums.at(j) == target)
            {
                result.push_back(i);
                result.push_back(j);
                break;
            }
            i++;
            j++;
        }
        return result;
    }
};