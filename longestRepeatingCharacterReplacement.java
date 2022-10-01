import java.util.*;
public class longestRepeatingCharacterReplacement {
//     Input: s = "ABAB", k = 2
// Output: 4
// Explanation: Replace the two 'A's with two 'B's or vice versa.
    public static int findSum(String str  , int k){

        int maxLength  =0;

        HashMap<Character,Integer> map =  new HashMap<>();

        int start = 0;
        int end = 0;

        while(end<str.length()){
           
            map.put(str.charAt(end),map.getOrDefault(str.charAt(end), 0)+1);
     
         while((end-start+1)-Collections.max(map.values())>k){
            map.put(str.charAt(start), map.get(str.charAt(start))-1);
            if(map.get(str.charAt(start))==0){
                map.remove(str.charAt(start));
            }
            start++;
         }
         maxLength = Math.max(end-start+1, maxLength);
         end++;


        }
        return start==0?Integer.MAX_VALUE:maxLength;
        





    }
}
