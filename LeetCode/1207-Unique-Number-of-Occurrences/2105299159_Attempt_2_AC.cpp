class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> m;
        for(int i=0; i<arr.size(); i++) m[arr[i]]++;
        
        unordered_set<int> s;
        for(auto p : m)
        {
            if(s.find(p.second) == s.end()) s.insert(p.second);
            else return false;
        }
        return true;
    }
};