class Solution {
    public String solution(String my_string) {
        String[] aeiou = new String[] {"a", "e", "i", "o", "u"};
        for(String str : aeiou){
            my_string = my_string.replace(str, "");
        }
        return my_string;
    }
}