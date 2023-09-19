class Solution {
    public String solution(String p) {
        String answer = "";
        
        answer = makeCollectParentheses(p);
        
        return answer;
    }
    
    public static String makeCollectParentheses(String p) {
        
        if(p.equals("")) { return ""; }
        
        int balanceIdx = findBalanceParenthesesIdx(p);
        String u = p.substring(0, balanceIdx+1);
        String v = p.substring(balanceIdx+1);
        
        if(u.charAt(0) == ')') {
            // 올바른 문자열이 아니라면
            String tmp = "(";
            tmp += makeCollectParentheses(v);
            tmp += ")";
            for(int i = 1; i < u.length()-1; i++) {
                if(u.charAt(i) == '(') { tmp += ")"; }
                else { tmp += "("; }
            }
            
            return tmp;
        }
        else {
            u += makeCollectParentheses(v);
        }
        
        return u;
    }
    
    public static int findBalanceParenthesesIdx(String p) {
        int balance = 0;
        
        for(int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == '(') { balance++; }
            else { balance--; }
            
            if(balance == 0) {
                balance = i;
                break;
            }
        }
        
        return balance;
    }
}