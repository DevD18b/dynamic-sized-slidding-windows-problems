package easyLcSlidingWindow;
import java.util.*;
public class longestNiceSubString {
    public static boolean isNice(String str)
    {

        HashMap<Character,Integer> map =  new HashMap<>();

        for(int i =0; i<str.length(); i++){
            map.put(str.charAt (i) , map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(Character.isLowerCase(m.getKey())){
                if(!map.containsKey(Character.toUpperCase(m.getKey()))){
                    return false;
                }
            }
            if(Character.isLowerCase(m.getKey())){
                if(!map.containsKey(Character.toUpperCase(m.getKey()))){
                   return false;
                }
            }
        }
return true;
    }
    public static String driverFunction(String str){
        String ans  = "";
        for(int i =0; i<str.length(); i++){
           for(int j = i+1 ; j<str.length(); j++){
             String temp = str.substring(i,j+1);
             if(isNice(temp) && ans.length()<str.length()){{
                ans = temp;
             }
           }
        }
        
    }
    return ans;

}
}
