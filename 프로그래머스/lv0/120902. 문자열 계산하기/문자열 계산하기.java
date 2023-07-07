class Solution {
    public int solution(String my_string) {
        String[] oper = my_string.split(" ");
        int answer = Integer.parseInt(oper[0]);
        
        for(int i = 1; i < oper.length; i += 2) {
            if(oper[i].equals("+")) {
                answer += Integer.parseInt(oper[i+1]);
            }
            else {
                answer -= Integer.parseInt(oper[i+1]);
            }
        }
        return answer;
    }
}