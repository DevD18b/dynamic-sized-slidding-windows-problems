package easyLcSlidingWindow;
import java.util.*;
public class subArraysWithKDistinctInteger {
    public static int count(int [] nums , int k){
        
        return 
        helper(nums, k) - helper(nums, k-1);

    }
    public static int helper(int [] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int start  = 0;
        int end  = 0;
        int count   = 0;


        while(end<nums.length){
            map.put(nums[end] , map.getOrDefault(nums[end], 0)+1);
            while(map.size()>k){
                map.put(nums[start] , map.get(nums[start])-1);
                if(map.get(nums[start])==0){
                    map.remove(nums[start]);
                }
                start++;
            }
            count+=end-start+1;
            end++;
        }
        return count;
    }
}
