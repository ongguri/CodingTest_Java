import java.util.ArrayList;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        String shortNum = "", longNum = "";
        int aLen = a.length(), bLen = b.length();
        int over = 0;
        
        for(int i = 0; i < Math.abs(aLen - bLen); i++) {
            shortNum += "0";
        }
        shortNum += aLen < bLen ? a : b;
        longNum += aLen < bLen ? b : a;
        
        
        ArrayList<Integer> addNumList = new ArrayList<Integer>();
        for(int i = shortNum.length()-1; i >= 0; i--) {
            int num1 = shortNum.charAt(i) - '0';
            int num2 = longNum.charAt(i) - '0';
            addNumList.add((num1 + num2 + over) % 10);
            over = (num1 + num2 + over) / 10;
        }
        
        if(over != 0) {
            addNumList.add(over);
        }
        
        for(int i = addNumList.size()-1; i >= 0; i--) {
            answer += addNumList.get(i) + "";
        }
        
        return answer;
    }
}