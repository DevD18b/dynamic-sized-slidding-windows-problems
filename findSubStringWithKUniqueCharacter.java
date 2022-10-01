import java.util.HashMap;
public class findSubStringWithKUniqueCharacter{


    // mujhe ek string dii hai jisme characters honge
    // for example --> "AAAHHIBBC"
    // for k =  3.


    public static int findLengthOfStringConsistingOfKUniqCharacter(String str,  int k){

        int start = 0;
      //  int end  = 0;
      int maxLength = 0;


        HashMap<Character , Integer> map = new HashMap<>();

        for(int end = 0; end<str.length(); end++){
            
            map.put(str.charAt(end) , map.getOrDefault(str.charAt(end), 0)+1);
        
             while(map.size()>k){
               char prevChar  = str.charAt(start);
                map.put(prevChar , map.get(prevChar)-1);
                if(map.get(prevChar)==0){
                    map.remove(prevChar);
                }
                start++;
             }
             maxLength  =  Math.max(maxLength,end-start+1);
             end++;
        }
        return maxLength;




    }
    public static void main(String[] args) {
        String str  = "AAAHHIIBC";
        System.out.println(findLengthOfStringConsistingOfKUniqCharacter(str, 3));
    }
    
}
