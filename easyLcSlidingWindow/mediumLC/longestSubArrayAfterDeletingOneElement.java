package easyLcSlidingWindow.mediumLC;



public class longestSubArrayAfterDeletingOneElement {
 
    
//     Given a binary array nums, you should delete one element from it.

// Return the size of the longest non-empty subarray containing only 
// 1's in the resulting array. Return 0 if there is no such subarray.

 

// Example 1:

// Input: nums = [1,1,0,1]
// Output: 3
//Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.



public static int deleteOneToMakeItLongest(int [] arr){


    // this problem is same as max consecutive ones.


    // wha  hum zero count maintain krte the jaise hi hum window size ki limit tk pahoch jaate the toh hum 
    // aur ache windows search krte the ziskko swap kr keh hum ache ans pr pahoch paaye.


    // just here it is.

    int start = 0;
    int end = 0;
    int zeroCount = 0;
     int maxLength = 0;
    while(end<arr.length){
        if(arr[end]==0){
             zeroCount++;
        }
        while(zeroCount>1){
            if(arr[start]==zeroCount){
                zeroCount--;
            }
            start++;
        }
         maxLength = Math.max(end-start+1 , maxLength);
         end++;
    }
    return maxLength-1;
}
 // method 2 reverse engineering.



 public static int deleteOneToMakeItMax(int [] arr){


    int start = 0;
    int end  = 0;

    int k  = 1;

    int maxLength  = 0;

    while(end<arr.length){
        if(arr[end]==0){
            k--;
        }
        while(k<0){
            if(arr[start]==0){
                k++;
            }
            start++;
        }
           maxLength = Math.max(maxLength, end-start);
               end++;
        }
    return maxLength;

 }

}
