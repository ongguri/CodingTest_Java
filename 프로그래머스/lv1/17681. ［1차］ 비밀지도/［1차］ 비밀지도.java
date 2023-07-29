class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            String map = Integer.toBinaryString(arr1[i] | arr2[i]);
            
            map = map.replaceAll("1", "#");
            map = map.replaceAll("0", " ");
            
            if(map.length() < n) {
                sb.append(" ".repeat(n - map.length()));
                sb.append(map);
                answer[i] = sb.toString();
                sb.setLength(0);
            }
            else {
                answer[i] = map;
            }
            
        }
        
        return answer;
    }
}