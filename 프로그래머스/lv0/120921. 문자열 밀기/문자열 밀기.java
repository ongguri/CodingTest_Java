class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        // if(A.equals(B)) { return answer; }
        
        int lenA = A.length();
        while(!A.equals(B)) {
            String[] arrA = new String[lenA];
            for(int i = 1; i <= lenA; i++) {
                arrA[i%lenA] = A.substring(i-1, i);
            }
            String strA = String.join("", arrA);
            A = strA;
            System.out.println(strA);
            answer++;
            if(strA.equals(B)) {
                break;
            }
            else if(answer == lenA) { 
                answer = -1; 
                break;
            }
        }
        return answer;
    }
}