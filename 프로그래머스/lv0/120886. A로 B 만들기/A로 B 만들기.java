class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] beforeList = before.split("");
        
        for(String str : beforeList) {
            if(after.contains(str)) {
                after = after.replaceFirst(str, "");
            }
        }
        if(after.length() == 0) { answer = 1; }
        return answer;
    }
}