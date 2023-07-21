import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> todo_list_arr = new ArrayList<String>();
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                todo_list_arr.add(todo_list[i]);
            }
        }
        
        String[] answer = todo_list_arr.toArray(new String[todo_list_arr.size()]);
        return answer;
    }
}