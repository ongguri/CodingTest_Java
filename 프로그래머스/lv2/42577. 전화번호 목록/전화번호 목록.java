import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> phoneSet = new HashSet<String>();
        for (String phone : phone_book) {
            phoneSet.add(phone);
        }
        
        for(String phone : phone_book) {
            for(int i = 0; i < phone.length(); i++) {
                if(phoneSet.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true;
    }
}