package easyLcSlidingWindow;

public class findKBeautyOfNumber {
    
    public static int solver(int n , int k){
        int cur = 0;
        int ans = 0;
          StringBuilder sb = new StringBuilder(String.valueOf(n));
        for(int i =0 ; i<k; i++)
        {
            cur =  cur*10+(sb.charAt(i)-'0');
        }
        if((n%cur)==0){
            ans++;
        }
        int div = (int) Math.pow(10 , k-1);
        for(int i = k; i<sb.length(); i++){
               cur %=div;
               cur = cur*10+(sb.charAt(i)-'0');
               if(cur!=0 && n%cur==0){
                ans++;
               }
        }
        return ans;





    }



}
