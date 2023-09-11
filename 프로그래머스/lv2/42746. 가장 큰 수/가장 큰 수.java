import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        });
        // System.out.println(Arrays.toString(strNumbers));
        
        if(strNumbers[0].equals("0")) { return "0"; }
        
        for(int i = 0; i < strNumbers.length; i++) {
            answer.append(strNumbers[i]);
        }
        
        return answer.toString();
    }
}