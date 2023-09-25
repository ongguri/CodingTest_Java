import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<String, Integer>();
        for(int i = 0; i < want.length; i++) {
            wantMap.put(want[i], i);
        }
        // System.out.println(wantMap);
        
        for(int i = 0; i <= discount.length-10; i++) {
            int[] numberOper = number.clone();
            for(int j = i; j < i+10; j++) {
                if(wantMap.get(discount[j]) != null) {
                    numberOper[wantMap.get(discount[j])]--;
                }
            }
            if(isAllBuy(numberOper)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public static boolean isAllBuy(int[] numberOper) {
        
        for(int num : numberOper) {
            if(num > 0) { return false; }
        }
        
        return true;
    }
}