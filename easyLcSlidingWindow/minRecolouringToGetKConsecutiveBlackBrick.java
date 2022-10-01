package easyLcSlidingWindow;

public class minRecolouringToGetKConsecutiveBlackBrick {
    
    public static int find(String str  , int k){

int start = 0;
int end = 0;
int count =0;
int minAns = Integer.MAX_VALUE;


while(end<str.length()){
    if(str.charAt(end)=='W'){
        count++;
    }
    if(end-start+1<k){
        end++;
    }
   else if(end-start+1 == k){
    minAns = Math.min(minAns, count);
        if(str.charAt(start)=='W'){
            count--;
        }
        start++;
        end++;
   }
}
return minAns;





    }
}
