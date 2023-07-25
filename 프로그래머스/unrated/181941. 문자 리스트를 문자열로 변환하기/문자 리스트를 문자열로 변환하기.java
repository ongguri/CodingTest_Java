class Solution {
    public String solution(String[] arr) {
        // return String.join("", arr);
        StringBuilder answer = new StringBuilder();
        for(String str : arr) {
            answer.append(str);
        }
        
        return answer.toString();
    }
}