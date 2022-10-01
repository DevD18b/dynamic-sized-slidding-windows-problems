import java.util.*;
public class distinctIntegerSubArray {
    
    // given Array of positive integer.
    //we consider any subArray as a good subArray
    // if the number of different integer
    // in that subArray is exactly B.




    public static int subArrayWithDistinctInteger(int [] arr , int b){


        return subArrayWithAtmostKDistinctInteger(arr , b)  -  subArrayWithAtmostKDistinctInteger(arr, b-1);

    }
    public static int subArrayWithAtmostKDistinctInteger(int [] arr , int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
int count  = 0;
     while(end<arr.length){

        map.put(arr[end], map.getOrDefault(arr[end], 0)+1);

        while(map.size()>k){
            map.put(arr[start], map.get(arr[start])-1);
            if(map.get(arr[start])==0){
                map.remove(arr[start]);
            }
            start++;
        }
        count+=end-start+1;
        end++;
     }

     return count;
    }
}
