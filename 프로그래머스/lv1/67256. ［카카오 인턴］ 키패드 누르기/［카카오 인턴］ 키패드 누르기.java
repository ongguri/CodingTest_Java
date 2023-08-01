import java.util.HashMap;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[][] leftRightHand = {{0, 0}, {2, 0}};
        int[][] keyPadLoc = {{1, 0}, {0, 3}, {1, 3}, {2, 3},
                                   {0, 2}, {1, 2}, {2, 2},
                                   {0, 1}, {1, 1}, {2, 1}};
        
        for(int number : numbers) {
            String touchHand = touchKeyPad(keyPadLoc, leftRightHand, number, hand);
            answer.append(touchHand);
            
            if(touchHand.equals("L")) { leftRightHand[0] = keyPadLoc[number]; }
            else if(touchHand.equals("R")) { leftRightHand[1] = keyPadLoc[number]; }
        }
        
        return answer.toString();
    }
    
    public String touchKeyPad(int[][] keyPadLoc, int[][] leftRightHand, int number, String hand) {
        String touchHand = "";
        
        if(number == 1 || number == 4 || number == 7) {
            touchHand = "L";
        }
        else if(number == 3 || number == 6 || number == 9) {
            touchHand = "R";
        }
        else {
            double leftHandDist = keyPadDistance(keyPadLoc, leftRightHand[0], number);
            double rightHandDist = keyPadDistance(keyPadLoc, leftRightHand[1], number);
            touchHand = (leftHandDist < rightHandDist) ? "L" : "R";
            
            if(leftHandDist == rightHandDist) {
                touchHand = (hand.equals("left")) ? "L" : "R";
            }
        }
        
        return touchHand;
    }
    
    public double keyPadDistance(int[][] keyPadLoc, int[] handLoc, int number) {
        return Math.ceil(
            Math.sqrt(
                Math.pow(keyPadLoc[number][0] - handLoc[0], 2) +
                Math.pow(keyPadLoc[number][1] - handLoc[1], 2)
            ));
    }
}