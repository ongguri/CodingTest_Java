class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int decimal1 = Integer.parseInt(bin1, 2);
        int decimal2 = Integer.parseInt(bin2, 2);
        
        answer = Integer.toBinaryString(decimal1+decimal2);
        
        return answer;
    }
}