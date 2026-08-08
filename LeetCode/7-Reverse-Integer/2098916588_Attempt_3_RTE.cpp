class Solution {
public:
    int reverse(int x) {
        int rev = 0;
        if(x > INT_MAX || x < INT_MIN)
        {
            return 0;
        }
        else{
            while(x!=0)
            {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x = x / 10;
            }
        }
        return rev;
    }
};