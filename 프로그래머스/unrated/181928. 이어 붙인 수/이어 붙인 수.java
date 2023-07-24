class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder();
        StringBuilder evenNum = new StringBuilder();
        
        for(int num : num_list) {
            if(num % 2 == 0) { evenNum.append(Integer.toString(num)); }
            else if(num % 2 != 0) { oddNum.append(Integer.toString(num)); }
        }
        
        int answer = Integer.parseInt(oddNum.toString()) + Integer.parseInt(evenNum.toString());
        
        return answer;
    }
}