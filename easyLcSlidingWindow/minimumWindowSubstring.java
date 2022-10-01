package easyLcSlidingWindow;


public class minimumWindowSubstring {
    public static String minWindow(String str , String target){
       int [] map = new int[128];
       
       for(char ch : target.toCharArray()){
        map[ch]+=1;
       }

       int begin = 0;
       int minlength =  Integer.MAX_VALUE;
       int count  = target.length();
       for(int left = 0, right = 0; right<str.length(); right++){
        
           char rc = str.charAt(right);
           map[rc]--;
           if(map[rc]>=0){
            count--;
           }
           while(count==0){
             char leftChar  = str.charAt(left);
             map[leftChar]++;
             if(right-left+1<minlength){
                begin = left;
                minlength = right-left+1;
             }
             count++;
           }
           left++;
       }
       return minlength == Integer.MAX_VALUE?"":str.substring(begin,begin+minlength);
       
        
    }
}
