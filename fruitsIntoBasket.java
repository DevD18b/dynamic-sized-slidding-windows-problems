import java.util.*;
public class fruitsIntoBasket {


    // this problem is same as the longest subArray of size 2.
    // we have 2 basket we can fill it with
    //  maximum amount of fruits of one type.

    public static int findOut(int []  fruits){
        int start  = 0;
        int end =0 ;

        int maxLength  =0;

        HashMap<Integer,Integer> map = new HashMap<>();

        while(end<fruits.length){
            map.put(fruits[end] , map.getOrDefault(fruits[end], 0)+1);
        
            while(map.size()>2){
                map.put(fruits[start],map.get(fruits[start])-1);
                 if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                 }
                 start++;
            }
            if(map.size()==2){
            maxLength = Math.max(end-start+1, maxLength);
            }
            end++;
        }
        return maxLength;



        
    }



    // goowmgle problem.

    // ek meh apni standard seh karunga...
    // ek jo meh dekha hoo woh approach lagaunga.
    public static int maximumAmountOfFruitsInBasket(int [] fruits){


         int start  =0 ;
         HashMap<Integer,Integer> map = new HashMap<>();


         int maxLength = 0;

         int end  = 0;
         while(end<fruits.length){
           if(map.size()<2){
            map.put(fruits[end], end++);
           }
           if(map.size()>2){
             int minimum = 
              fruits.length-1;
              for(int value:map.values()){
                minimum = Math.min(minimum, value);
              }
               start =  minimum+1;
              map.remove(fruits[minimum]);
           }
           maxLength = Math.max(end-start+1, maxLength);

         }

         return maxLength;
    }

    



    
}
