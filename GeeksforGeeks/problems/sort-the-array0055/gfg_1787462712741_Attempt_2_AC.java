int mid= arr.length / 2;
        
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[arr.length-mid];
        
        for(int i=0; i<mid; i++)
            arrLeft[i] = arr[i];
            
        for(int i=0; i<arr.length-mid; i++)
            arrRight[i] = arr[i+mid];
            
        sortArr(arrLeft);
        sortArr(arrRight);
        merge(arr, arrLeft, arrRight);
    }
    
    void merge(int[] arr, int[] arrLeft, int[] arrRight)
    {
        int l = 0;
        int r = 0;
        int k = 0;
        
        //while both have elements
        while(l < arrLeft.length && r < arrRight.length)
        {
            if(arrLeft[l] <= arrRight[r])
                arr[k++] = arrLeft[l++];
            else
                arr[k++] = arrRight[r++];
        }
        
        //while only leftARR has elements
        while(l < arrLeft.length)
            arr[k++] = arrLeft[l++];
            
        //while only rightARR has elements
        while(r < arrRight.length)
            arr[k++] = arrRight[r++];
    }
}