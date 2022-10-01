import java.util.*;
public class subStringSize3WithDistinctCharacter {
    public static int  countFreq(String str){
    HashMap<Character,Integer> map =  new HashMap<>();
        for(int i =0; i<str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Map.Entry<Character,Integer>m : map.entrySet()){
            if(m.getValue()>2)
            return 0;
        }
        return 1;
    }
    public static int driver(String str){

        int count  = 0;
        for(int  i =0; i<str.length()-3; i++){
            count+= countFreq(str.substring(i , i+3));
        }
        return count;
    }
}
