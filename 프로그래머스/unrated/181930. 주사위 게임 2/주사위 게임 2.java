import java.util.HashSet;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;        

        HashSet<Integer> diceSet = new HashSet<Integer>();
        diceSet.add(a);
        diceSet.add(b);
        diceSet.add(c);
        
        if(diceSet.size() == 3) {
            answer = a + b + c;
        }
        else if(diceSet.size() == 2) {
            answer = (a + b + c) * (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        }
        else if(diceSet.size() == 1) {
            answer = (a + b + c) * 
                (int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) *
                (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        
        return answer;
    }
}