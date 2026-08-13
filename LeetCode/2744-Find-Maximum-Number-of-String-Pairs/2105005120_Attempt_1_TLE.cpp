class Solution {
public:
    string reverse(string s)
    {
        int len = s.size();
        int i=0;
        int j=len-1;

        while(i< len/2)
        {
            char tem = s[i];
            s[i] = s[j];
            s[j] = tem;
            i++;
            j--;
        }
        return s;
    }
    int maximumNumberOfStringPairs(vector<string>& words) {
        unordered_set<string> us;
        int count = 0;

        for(int i=0; i<words.size(); i++)
        {
            string rev = reverse(words[i]);
            if(us.find(rev) == us.end())
            {
               count++;
            }
            us.insert(rev);
        }

        return count;
    }
};