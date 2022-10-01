package easyLcSlidingWindow.mediumLC;

public class maximumConfusionInExam {

    public static int maximumConsecutiveEntity(String str, int k){

        int count  =0 ;
        int start  = 0;
        int end  =0 ;
        int ans   = 0;
        while(end<str.length()){
            if(str.charAt(end)=='T'){
                count++;
            }
            while(count>k){
                if(str.charAt(start)=='T'){
                    count--;
                }
                start++;
            }
            ans = Math.max(ans, end-start+1);
            end++;
        }
        start = 0;
        count  =0;
        end = 0;
        while(end<str.length()){
            if(str.charAt(end)=='F'){
                count++;
            }
            while(count>k){
                if(str.charAt(start)=='F'){
                    count--;
                }
                start++;
            }
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
