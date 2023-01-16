class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int nextIndex = 0;
        
        if(direction.equals("right")) {
            nextIndex = 1;
        }
        else { 
            nextIndex = numbers.length-1;
        }
        
        for(int i = 0; i < numbers.length; i++) {
            answer[(i+nextIndex) % numbers.length] = numbers[i];
        }
        
        return answer;
    }
}