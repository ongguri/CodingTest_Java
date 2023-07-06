class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = Integer.toString(order);
        for(int i = 0; i < num.length(); i++) {
            if((num.charAt(i)-'0') % 3 == 0 && num.charAt(i) != '0') {
                answer++;
            }
        }
        return answer;
    }
}