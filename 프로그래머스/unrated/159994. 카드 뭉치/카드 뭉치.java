class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cardsOneIdx = 0, cardsTwoIdx = 0;
        
        for(String goalStr : goal) {
            if(cardsOneIdx < cards1.length && cards1[cardsOneIdx].equals(goalStr)) {
                cardsOneIdx++;
            }
            else if(cardsTwoIdx < cards2.length && cards2[cardsTwoIdx].equals(goalStr)) {
                cardsTwoIdx++;
            }
            else {
                answer = "No";
                break;
            }
            
        }
        
        return answer;
    }
}