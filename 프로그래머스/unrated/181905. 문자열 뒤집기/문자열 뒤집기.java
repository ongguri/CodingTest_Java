class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder str = new StringBuilder();
        StringBuilder strRevers = new StringBuilder();
        str.append(my_string.substring(0, s));
        
        strRevers.append(my_string.substring(s, e+1)).reverse();
        
        str.append(strRevers.toString());
        str.append(my_string.substring(e+1, my_string.length()));
        
        return str.toString();
    }
}