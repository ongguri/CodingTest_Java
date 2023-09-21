class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) {
            String x = s.replace("0", "");
            answer[1] += s.length()-x.length();
            
            int len = x.length();
            s = Integer.toBinaryString(len);
            answer[0]++;
        }
        
        return answer;
    }
}