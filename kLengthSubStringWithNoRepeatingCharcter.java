import java.util.*;
public class kLengthSubStringWithNoRepeatingCharcter {


    public static int findLength(String str,  int k){

        Set<Character> set = new HashSet<>();
        // int ans = 0;
        int end  = 0;
        int maxLength= 0;
        for(int start  = 0; start<str.length(); start++){
          
            while(set.contains(str.charAt(start)) || (start+end-1)>k){
                set.remove(str.charAt(end));
                ++end;
            }
            set.add(str.charAt(start));
           if((start-end+1)==k)
            maxLength = Math.max(maxLength, start-end+1);
        }


        return maxLength;

    }
    
}
