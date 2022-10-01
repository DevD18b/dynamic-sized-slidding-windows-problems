package easyLcSlidingWindow.mediumLC;

// import java.net.MalformedURLException;

public class maximumNumberOfVowelsInSubStringsOfGivenLength {

    public static boolean isVowel(char ch ){
      if(ch=='a' || ch == 'e' || ch =='i' || ch=='o' || ch=='u') return true;
      return false;
    }
    
    public static int findNumberOfVowels(String str , int k){

int count  = 0;

for(int i =0; i<k; i++){
    if(isVowel(str.charAt(i))){
        count++;
    }
}
int max  = count;

for(int i = k; i<str.length(); i++){
    if(isVowel(str.charAt(i))) count++;
    if(isVowel(str.charAt(i-k))) count--;
    max = Math.max(count, max);
}
return max;





    }


}
