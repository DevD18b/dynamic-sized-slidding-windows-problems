package easyLcSlidingWindow.mediumLC;

import java.util.HashMap;

public class minConsecutiveCardsToPickUp {

    public static int minConsecutiveCards(int [] cards){
        HashMap<Integer,Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;

         for(int i = 0; i<cards.length; i++){
            if(map.containsKey(carsd[i])){
                int lastSeen = map.get(cards[i]);
                min = Math.min(min, i-lastSeen+1);
            }
            map.put(cards[i] , i);
         }
         return min == Integer.MAX_VALUE?-1:min;




    }
    





}
