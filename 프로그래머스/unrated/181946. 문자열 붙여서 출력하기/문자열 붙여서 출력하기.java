import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder result = new StringBuilder();
        result.append(a);
        result.append(b);
        
        System.out.println(result.toString());
    }
}