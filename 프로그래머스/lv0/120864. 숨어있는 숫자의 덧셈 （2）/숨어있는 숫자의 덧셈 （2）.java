class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] number = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for(String num : number) {
            if(!num.equals("")) answer += Integer.parseInt(num);
        }
        return answer;
    }
}