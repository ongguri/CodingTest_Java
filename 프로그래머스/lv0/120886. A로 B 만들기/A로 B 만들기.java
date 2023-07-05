class Solution {
    public int solution(String before, String after) {
        char str1 = 0;
        char str2 = 0;
        
        for(int c = 0; c < before.length(); c++) {
            str1 += before.charAt(c);
            str2 += after.charAt(c);
        }
        
        return (str1-str2 == 0) ? 1 : 0;
    }
}