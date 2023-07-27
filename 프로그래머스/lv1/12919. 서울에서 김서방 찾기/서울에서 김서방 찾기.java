class Solution {
    public String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ");
        
        int kim = 0;
        while(!seoul[kim].equals("Kim")) {
            kim++;
        }
        answer.append(Integer.toString(kim));
        answer.append("에 있다");
        
        return answer.toString();
    }
}