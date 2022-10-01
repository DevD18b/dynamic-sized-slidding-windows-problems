public class minSumSubArrayofSize {

    public static int minSumSubArrayGreaterThenTarget(int [] arr , int target){

        int start = 0;
        int end =0;

        int currentSum = 0;
int minLength = Integer.MAX_VALUE;
        while(end<arr.length){

            currentSum+=arr[end];

            while(currentSum>=target){
                minLength = Math.min(minLength, end-start+1);
                currentSum-=arr[start];
                start++;
            }
            end++;
        }
        return minLength!=Integer.MAX_VALUE?1:0; 



    }
}
