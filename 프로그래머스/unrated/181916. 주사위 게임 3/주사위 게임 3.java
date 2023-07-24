import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 7;
        HashMap<Integer, Integer> diceResult = new HashMap<Integer, Integer>();
        
        diceResult.put(a, diceResult.getOrDefault(a, 0) + 1);
        diceResult.put(b, diceResult.getOrDefault(b, 0) + 1);
        diceResult.put(c, diceResult.getOrDefault(c, 0) + 1);
        diceResult.put(d, diceResult.getOrDefault(d, 0) + 1);
        
        // System.out.println(diceResult);
        ArrayList<Integer> diceResultKey = new ArrayList<Integer>();
        for(Integer dice : diceResult.keySet()) {
            diceResultKey.add(dice);
        }
        
        int diceResultKeyLen = diceResultKey.size();
        if(diceResultKeyLen == 1) {
            answer = 1111 * diceResultKey.get(0);
        }
        else if(diceResultKeyLen == 2) {
            int dice1 = diceResultKey.get(0);
            int dice2 = diceResultKey.get(1);
            
            if((diceResult.get(dice1) == 1 && diceResult.get(dice2) == 3)) {
                //(10 × p + q)^2
                answer = (int)Math.pow((10 * dice2 + dice1), 2);
            }
            else if((diceResult.get(dice1) == 3 && diceResult.get(dice2) == 1)) {
                answer = (int)Math.pow((10 * dice1 + dice2), 2);
            }
            else if(diceResult.get(dice1) == diceResult.get(dice2)) {
                answer = (dice1 + dice2) * Math.abs(dice1 - dice2);
            }
        }
        else if(diceResultKeyLen == 3) {
            int dice1 = diceResultKey.get(0);
            int dice2 = diceResultKey.get(1);
            int dice3 = diceResultKey.get(2);
            
            if(diceResult.get(dice1) == 2) {
                answer = dice2 * dice3;
            }
            else if(diceResult.get(dice2) == 2) {
                answer = dice1 * dice3;
            }
            else if(diceResult.get(dice3) == 2) {
                answer = dice1 * dice2;
            }
        }
        else if(diceResultKeyLen == 4) {
            for(int i = 0; i < diceResultKeyLen; i++) {
                answer = Math.min(answer, diceResultKey.get(i));
            }
        }
        
        return answer;
    }
}