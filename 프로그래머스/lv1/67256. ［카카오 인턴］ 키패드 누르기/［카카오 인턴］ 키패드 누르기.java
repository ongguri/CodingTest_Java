import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int[] leftHandLoc = {0, 0}, rightHandLoc = {2, 0};
        int[][] keyPadLoc = {{1, 0}, {0, 3}, {1, 3}, {2, 3},
                                   {0, 2}, {1, 2}, {2, 2},
                                   {0, 1}, {1, 1}, {2, 1}};
        
        // HashMap<Integer, Integer[]> keyPadMap = new HashMap<Integer, Integer[]>();
        // keyPadMap.put(0, new Integer[]{1, 0});
        // int y = 3;
        // for(int i = 0; i < 9; i++) {
        //     keyPadMap.put(i+1, new Integer[]{i % 3, y});
        //     if(i % 3 == 2) { y--; }
        // }  // 키패드 좌표값
        
        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                answer.append("L");
                leftHandLoc = keyPadLoc[number];
            }
            else if(number == 3 || number == 6 || number == 9) {
                answer.append("R");
                rightHandLoc = keyPadLoc[number];
            }
            else {
                double leftHandDist = Math.ceil(
                    Math.sqrt(
                        Math.pow(keyPadLoc[number][0] - leftHandLoc[0], 2) +
                        Math.pow(keyPadLoc[number][1] - leftHandLoc[1], 2)
                    ));
                
                double rightHandDist = Math.ceil(
                    Math.sqrt(
                        Math.pow(keyPadLoc[number][0] - rightHandLoc[0], 2) +
                        Math.pow(keyPadLoc[number][1] - rightHandLoc[1], 2)
                    ));
                
                if(leftHandDist < rightHandDist) {
                    answer.append("L");
                    leftHandLoc = keyPadLoc[number];
                }
                else if(leftHandDist > rightHandDist) {
                    answer.append("R");
                    rightHandLoc = keyPadLoc[number];
                }
                else {
                    if(hand.equals("left")) {
                        answer.append("L");
                        leftHandLoc = keyPadLoc[number];
                    }
                    else if(hand.equals("right")) {
                        answer.append("R");
                        rightHandLoc = keyPadLoc[number];
                    }
                }
            }
        }
        
        return answer.toString();
    }
}