import java.util.*;
public class longestSubStringWithoutRepeatingCharcters{
public static int findLengthOfUniqString(String str){
    HashMap<Character, Integer> map =  new HashMap<>();
     int prev  = 0;
     int end = 0;
     int maxLength = 0;
   while(end<str.length()){ 
        map.put(str.charAt(end) , map.getOrDefault(str.charAt(end), 0)+1);
        // mujhe jab tk k ki value nhi dete question. meko
        // yeh sawa aage hii nhi badhate aayega.
        // toh kuch aise soch ki jb tk start<end --> standard two pointer waali  template hai jo ki
        // and jaise hii mujhe ek character repeating dikh gaya --> kese map keh jariye.

        while(prev<end && map.get(str.charAt(end))>1){
             char ch = str.charAt(prev);
             map.put(ch, map.get(ch)-1);
             prev++;
        }
        maxLength = Math.max(maxLength,end-prev+1);
        end++;
    }
    return maxLength;
}
public static void main(String[] args) {
    String str  = "abcbcabc";
    System.out.println(findLengthOfUniqString(str));
}
}