class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] str = my_string.split("");
        
        for(int[] query : queries) {
            for(int i = query[0]; i <= (query[1]-query[0]) / 2 + query[0]; i++) {
                String tmp = str[i];
                str[i] = str[query[1]+query[0]-i];
                str[query[1]+query[0]-i] = tmp;
            }
        }
        
        answer = String.join("", str);
        return answer;
    }
}