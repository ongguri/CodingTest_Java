class Solution {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        String[] zero = new String[]{"0"};
        
        int answerIdx = 0;
        for(long number : numbers) {
            String[] bin = Long.toBinaryString(number).split("");
            String[] binArr = addZero(bin);
            
            int idx = findZero(binArr);
            binArr[idx] = "1";
            
            if(number % 2 == 1) {
                binArr[idx+1] = "0";
            }
            
            String result = String.join("", binArr);
            answer[answerIdx++] = Long.parseLong(result, 2);
        }
        
        return answer;
    }
    
    public static String[] addZero(String[] bin) {
        String[] result = new String[bin.length+1];
        result[0] = "0";
        
        for(int i = 1; i < result.length; i++) {
            result[i] = bin[i-1];
        }
        
        return result;
    }
    
    public static int findZero(String[] bin) {
        int idx = 0;
        
        for(int i = bin.length-1; i >= 0; i--) {
            if(bin[i].equals("0")) {
                idx = i;
                break;
            }
        }
        
        return idx;
    }
}