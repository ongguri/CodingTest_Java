class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num = "";
        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) < 65 || my_string.charAt(i) > 122) {
                num += my_string.charAt(i);
            }
            else if(num.length() != 0) {
                answer += Integer.parseInt(num);
                num = "";
            }
        }
        
        if(num.length() != 0) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}