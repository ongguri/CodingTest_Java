class Solution {
    public int solution(int[] array) {
        String answer = "";
        
        for(int arr : array) {
            answer += Integer.valueOf(arr);
        }
        
        return answer.length() - answer.replace("7", "").length();
    }
}