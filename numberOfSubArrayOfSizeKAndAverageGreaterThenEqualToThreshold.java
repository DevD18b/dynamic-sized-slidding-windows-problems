public class numberOfSubArrayOfSizeKAndAverageGreaterThenEqualToThreshold {

    // Given an array of integers arr and two integers k and threshold,
    //  return the number of sub-arrays of size k and
    //   average greater than or equal to threshold.

 

    // Example 1:
    
    // Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
    // Output: 3
    // Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. 
    // All other sub-arrays of size 3 have averages less than 4 (the threshold).

    public static int findSum(int [] arr , int window , int average){

        int currentSumSoFar = 0;
        int thresholdCount  = 0;

        int end  = 0;
        int start = 0;

        while(end<arr.length){
            currentSumSoFar+=arr[end];
            while(end >= window-1){
                if((currentSumSoFar/window)>average){
                    thresholdCount++;
                }
                currentSumSoFar-=arr[start];
                start++;
            }
            end++;
        }
        return thresholdCount;

    }





    
}
