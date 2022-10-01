

public class maximumConsecutiveOnes{
    // Given a binary array nums and an integer k, 
    // return the maximum number of consecutive 1's 
    // in the array 
    // if you can flip at most k 0's.

    public static int kflips(int [] arr , int k){


        int start = 0 ;
        int end  = 0;
        int zeroCount  =0;
        int countFlips =0;
        while(end<arr.length){


            if(arr[end]==0){
              zeroCount++;
            }
            while(zeroCount>k){

                if(arr[start]==0)
                {
                    zeroCount--;
                }
                 start++;
            }
            countFlips = Math.max(countFlips, end-start+1);
            end++;
        }
        return countFlips;







    }






}