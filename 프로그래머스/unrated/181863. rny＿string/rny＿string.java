class Solution {
    public String solution(String rny_string) {
        // return rny_string.replaceAll("m", "rn");
        String[] strArr = rny_string.split("");
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("m")) {
                strArr[i] = "rn";
            }
        }
        
        String answer = String.join("", strArr);
        return answer;
    }
}