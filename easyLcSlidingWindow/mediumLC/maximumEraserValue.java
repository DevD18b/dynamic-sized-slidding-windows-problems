package easyLcSlidingWindow.mediumLC;
import java.util.*;
public class maximumEraserValue {
    
    public static int find(int [] arr , int k){
        int start  =0;
        int end = 0;
        int sum = 0;
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        while(end<arr.length){
         
            while(start<end && set.contains(arr[end]))
            {
                set.remove(arr[start]);
                sum-=arr[start];
                start++;
            }


            set.add(arr[end]);
            sum+=arr[end];
            ans = Math.max(end-start+1,ans);
             end++;

        }
        return ans;
    }



}
