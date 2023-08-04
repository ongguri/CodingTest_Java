import java.util.HashMap;

class Solution {
    public int solution(String s) {
        String[] numStrArr = {"zero", "one", "two", "three", "four", 
                              "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i <= 9; i++) {
            s = s.replaceAll(numStrArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
        
//         StringBuilder num = new StringBuilder();
//         StringBuilder numStr = new StringBuilder();
        
//         HashMap<String, Integer> numMap = new HashMap<String, Integer>();
//         numMap.put("zero", 0); numMap.put("one", 1);
//         numMap.put("two", 2); numMap.put("three", 3);
//         numMap.put("four", 4); numMap.put("five", 5);
//         numMap.put("six", 6); numMap.put("seven", 7);
//         numMap.put("eight", 8); numMap.put("nine", 9);
        
//         for(int i = 0; i < s.length(); i++) {
//             if(!s.substring(i, i+1).matches("[0-9]")) {
//                 numStr.append(s.charAt(i));
                
//                 if(numMap.get(numStr.toString()) != null) {
//                     num.append(numMap.get(numStr.toString()));
//                     numStr.setLength(0);
//                 }
//             }
//             else {
//                 num.append(s.charAt(i));
//             }
//         }
        
//         return Integer.parseInt(num.toString());
    }  // 시간 체크
}