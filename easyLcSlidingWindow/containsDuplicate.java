package easyLcSlidingWindow;
import java.util.*;
public class containsDuplicate {
    public static boolean count(int [] nums , int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            if(map.containsKey(nums[i])&& i-map.get(nums[i])<=k) return true;
            map.put(nums[i] , i);
        }
        return false;
    }
}
