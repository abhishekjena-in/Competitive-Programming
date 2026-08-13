class Solution {
public:
    int reverse(int x)
    {
        int rev = 0;
        while(x!=0)
        {
            int last_digit = x%10;
            x = x/10;
            rev = rev * 10 + last_digit;
        }
        return rev;
    }

    int countDistinctIntegers(vector<int>& nums) {
        int n = nums.size();
        for(int i=0; i<n; i++)
        {
            int r = reverse(nums[i]);
            nums.push_back(r);
        }

        unordered_set<int> os;
        for(int i=0; i<nums.size(); i++)
        {
            os.insert(nums[i]);
        }

        return os.size();
    }
};