// class Solution {
// public:
//     vector<int> twoSum(vector<int>& nums, int target) {
//         vector<int> result;
//         for(int i=0; i<nums.size()-1; i++)
//         {
//             for(int j=nums.size()-1; j>i; j--)
//             {
//                 if(nums.at(i) + nums.at(j) == target)
//                 {
//                     result.push_back(i);
//                     result.push_back(j);
//                     break;
//                 }
//             }
//         }
//         return result;
//     }
// };

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       vector<int> result;
        //element, index    
       unordered_map<int, int> m;

       for(int i=0; i<nums.size(); i++)
       {
            int req = target - nums[i];
            if(m.find(req) != m.end())
            {
                return {m[req], i};
            }
            m[nums[i]] = i;
       }

       return {};
    }
};