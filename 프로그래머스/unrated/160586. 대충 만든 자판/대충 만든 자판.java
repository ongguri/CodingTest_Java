class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        int answerIdx = 0;
        for(String target : targets) {
            // 입력할 문자열을 하나 가져옴            
            int touchCount = 0;
            for(int s = 0; s < target.length(); s++) {
                // 가져온 문자열의 문자를 하나씩 꺼내옴
                char targetChar = target.charAt(s);
                int touchMin = 1000;  // 대충 큰 값으로 초기화
                for(String key : keymap) {
                    // 만약 키 안에 가져온 문자가 있으면
                    if(key.indexOf(targetChar) != -1) { 
                        touchMin = Math.min(touchMin, key.indexOf(targetChar)+1);
                    }
                }
                if(touchMin != 1000) { touchCount += touchMin; }
                else {  // 만들 수 없는 타겟
                    touchCount = 0;
                    break;
                }
            }
            
            answer[answerIdx++] = (touchCount != 0) ? touchCount : -1;
        }
        
        return answer;
    }
}