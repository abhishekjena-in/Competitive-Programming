class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        // code here
        int largest = INT_MIN;
        int second_largest = INT_MIN;
        
        for(int i=0; i<arr.size(); i++)
        {
            if(arr[i] > largest)
            {
                second_largest = largest;
                largest = arr[i];
            }
            
            if(arr[i] < largest && arr[i] > second_largest)
            {
                second_largest = arr[i];
            }
        }
        
        if(second_largest == INT_MIN) return -1;
        
        return second_largest;
    }
};