public class maximumNumberOfOnesObetainedByAtmost1Swap {


    public static int atmostOneflip(int [] arr){

        int maxOnesTogether  = 0;
        int onesSoFar = 0;

        for(int i  =0; i<arr.length; i++){
            if(arr[i]==1){
                onesSoFar+=1;
            }
            if(onesSoFar>maxOnesTogether){
                maxOnesTogether = Math.max(maxOnesTogether, onesSoFar);
            }
            if(arr[i]==0){
                onesSoFar =0 ;
            }
        }
        return maxOnesTogether; 



    }
    
}
