#include<string>
class Solution {
public:
    int reverse(int x) {
        std::string s = std::to_string(x);
        bool flag = false;
        if(std::isdigit(s[0]))
        {
            flag = true; //pos
        }

        if(flag)//positive
        {
            int i = 0;
            int j = s.length()-1;
            while(i<s.length()/2)
            {
                int temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;
            }
        }
        if(!flag)//negative
        {
            int i = 1;
            int j = s.length()-1;
            while(i<s.length()/2)
            {
                int temp = s[i];
                s[i] = s[j];
                s[j] = temp;

                i++;
                j--;
            }
        }
        int resNum = std::stoi(s);
        return resNum;
    }
};