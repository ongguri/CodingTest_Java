import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9') {
				answer.add(my_string.charAt(i) - 48);
			}
		}
        Collections.sort(answer);
        return answer;
    }
}