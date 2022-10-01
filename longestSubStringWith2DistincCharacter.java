import java.util.*;
public class longestSubStringWith2DistincCharacter {

    public static int find(String str){

        HashMap<Character, Integer> map = new HashMap<>();

        int start  =0;
        int maxLength =0;
        int end = 0;
        while(end<str.length()){
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0)+1);

            if(map.size()==2){
               maxLength = Math.max(maxLength, end-start+1);
            }
            if(map.size()>2){
                while(start<end && map.size()>2){
                    map.put(str.charAt(start),map.get(str.charAt(start))-1);
                    start++;
                }
            }
              end++;
        }
        return maxLength;
    }
}
