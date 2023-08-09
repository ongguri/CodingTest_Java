class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        StringBuilder makeTargetSb = new StringBuilder();
        
        int answerIdx = 0;
        for(String target : targets) {
            // 입력할 문자열을 하나 가져옴            
            int touchCount = 0;
            for(int s = 0; s < target.length(); s++) {
                // 가져온 문자열의 문자를 하나씩 꺼내옴
                char targetChar = target.charAt(s);
                int minCount = 1000;  // 대충 큰 값으로 초기화
                for(String key : keymap) {
                    // 만약 키 안에 가져온 문자가 없으면
                    if(key.indexOf(targetChar) == -1) { 
                        continue; 
                    } // pass
                    else if(key.indexOf(targetChar) != -1) { // 키 안에 문자가 있으면,
                        minCount = Math.min(minCount, key.indexOf(targetChar)+1);
                    }   
                }
                if(minCount != 1000) { 
                    makeTargetSb.append(targetChar);
                    touchCount += minCount; 
                }
            }
            if(makeTargetSb.toString().equals(target) && touchCount != 0) {
                answer[answerIdx++] = touchCount;
            }
            else {
                answer[answerIdx++] = -1;
            }
            makeTargetSb.setLength(0);
        }
        
        return answer;
    }
}