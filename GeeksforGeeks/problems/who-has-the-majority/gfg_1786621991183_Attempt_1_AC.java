class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        int countX = 0;
        int countY = 0;
        
        for(int i : arr)
        {
            if(i == x)
            {
                countX++;
            }
            if(i == y)
            {
                countY++;
            }
        }
        
        if(countX > countY) return x;
        if(countY > countX) return y;
        if(countX == countY)
        {
            if(x < y) return x;
        }
        return y;
    }
}