class Solution {
public:
    unordered_map<char, int> getMapping(string s)
    {
        unordered_map<char, int> um;
        for(int i=0; i<s.size(); i++)
        {
            um[s[i]]++;
        }

        return um;
    }
    vector<string> removeAnagrams(vector<string>& words) {
        for(int i=1; i<words.size(); i++)
        {
            unordered_map<char, int> mCurr = getMapping(words[i]);
            unordered_map<char, int> mPrev = getMapping(words[i-1]);
            if(mCurr == mPrev)
            {
                words.erase(words.begin()+i);
                i--;
            }else{
                continue;
            }
        }

        return words;
    }
};