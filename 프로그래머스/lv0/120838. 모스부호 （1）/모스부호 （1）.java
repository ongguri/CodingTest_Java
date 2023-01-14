import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String [] letterList = letter.split(" ");
        
        for(String str : letterList) { 
	    	for(int ms = 0; ms < morse.length; ms++) {
	    		if(str.equals(morse[ms])) {
	    			answer += (char)('a' + ms);
	    		}
	    	}
	    }
        return answer;
    }
}