import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        int[] month = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String[] todayArr = today.split("[.]");
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        HashMap<String, Integer> termsMap = new HashMap<String, Integer>();
        for(String term : terms) {
            String[] termArr = term.split(" ");
            termsMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }
        // System.out.println("termsMap : " + termsMap);
        
        for(int p = 0; p < privacies.length; p++) {
            String[] dateStr = privacies[p].split("[.| ]");
            // System.out.println("dateStr : " + Arrays.toString(dateStr));
            
            int[] dateInt = {Integer.parseInt(dateStr[0]),
                             Integer.parseInt(dateStr[1]),
                             Integer.parseInt(dateStr[2])};
            
            dateInt[1] += termsMap.get(dateStr[3]);
            if(dateInt[1] > 12) {
                dateInt[0] += dateInt[1] / 12;
                if(dateInt[1] % 12 == 0) { dateInt[0]--; }
                dateInt[1] = month[dateInt[1]%12];
            }
            // System.out.println("dateInt : " + Arrays.toString(dateInt));
            
            if(--dateInt[2] == 0) {
                dateInt[2] = 28;
                dateInt[1] -= 1;
                if(dateInt[1] == 0) {
                    dateInt[1] = 12;
                    dateInt[0]--;
                }
            }
            // System.out.println("end privacy : " + Arrays.toString(dateInt));
            
            for(int i = 0; i < 3; i++) {
                if(Integer.parseInt(todayArr[i]) == dateInt[i]) { continue; }
                if(Integer.parseInt(todayArr[i]) > dateInt[i]) { result.add(p+1); }
                break;
            }
        }
        // System.out.println(result);
        
        int[] answer = new int[result.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}