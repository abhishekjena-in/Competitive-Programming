import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar= Integer.MIN_VALUE;
        int secondLar= Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > lar)
            {
                secondLar = lar;
                lar= arr[i];
            }
            
            if(arr[i]<lar && arr[i]>secondLar)
            {
                secondLar = arr[i];
            }
        }
        
        return secondLar==Integer.MIN_VALUE ? -1:secondLar;
    }
}