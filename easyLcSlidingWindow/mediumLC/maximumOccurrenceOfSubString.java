package easyLcSlidingWindow.mediumLC;
import java.util.HashMap;
import java.util.Map;

import easyLcSlidingWindow.minimumWindowSubstring;
public class maximumOccurrenceOfSubString {
    
public static int findOutMaxOccurenceOfSubString(String str , int minSize , int maxSize , int maxLetter){
     
    HashMap<String,Integer> map =  new HashMap<>();
    HashMap<Character, Integer> countMap =  new HashMap<>();
    
    
    int start = 0;
    int end  =0 ;
    
    while(end<str.length()){
         
        char current  = str.charAt(end);
        countMap.put(current , countMap.getOrDefault(current , 0)+1);
        
        while(end-start+1 > minSize){
        
            char ch = str.charAt(start);
            if(countMap.get(ch)==1){
                map.remove(ch);
            }
            countMap.put(ch , countMap.get(ch)-1);
            start++;
        }
       if(countMap.size() <= maxLetters && end-start+1 > minSize )
            map.put(str.substring(start,end+1),map.getOrDefault(str.substring(start,end+1),0)+1);
            end++;
    }
    int ans = 0;
    
    for(int it: map.values()){
        ans = Math.max(it , ans);
    }
    return ans;
    
    


}


}
