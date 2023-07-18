class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int count = 0;
        
        for(String s : picture) {
            String str = "";
            for(int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                for(int j = 0; j < k; j++) {
                    str += ch;
                }
            }
            do {
                answer[count] = str;
                count++;
            } while(count % k != 0);
        }
        return answer;
    }
}