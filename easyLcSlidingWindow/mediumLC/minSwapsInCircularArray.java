package easyLcSlidingWindow.mediumLC;

public class minSwapsInCircularArray {

    public static int count(int [] arr){
        int totalCount   = 0;
        
        for(int i  =0; i<arr.length; i++){
            totalCount+=arr[i];
        }
        if(totalCount<=1) return  0;

        int badCount  = 0;
        for(int i = 0; i<totalCount; i++){
            if(arr[i]==0){
                badCount++;
            }
        }
        int left = 0 ;
        int right  = totalCount;

        int ans  = 0;

        while(left<arr.length){
             if(arr[right % nums.left]==0){
                badCount++;
             }
             if(arr[left]==0){
                badCount++;
             }
           ans = Math.min(ans, badCount);
          left++;
          right++;
        }
        return ans;
    }
    
}
