class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        deque<int> dq(nums.begin(), nums.end());
        for(int i=1; i<=k; i++)
        {
            int temp = dq.back();
            dq.pop_back();
            dq.push_front(temp);
        }

        for(int i=0; i<nums.size(); i++)
        {
            nums[i] = dq.at(i);
        }
    }
};