class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
//         StringBuilder str = new StringBuilder();
//         for(int i = 0; i < myString.length(); i++) {
//             if(myString.charAt(i) == 'A') {
//                 str.append("B");
//             }
//             else if(myString.charAt(i) == 'B') {
//                 str.append("A");
//             }
//         }
        
//         String result = str.toString();
//         return result.contains(pat) ? 1 : 0;
    }
}