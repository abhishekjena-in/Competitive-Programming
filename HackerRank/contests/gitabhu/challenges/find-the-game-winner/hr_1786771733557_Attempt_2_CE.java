import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        
        int cumScore1 = 0;
        int cumScore2 = 0;
        
        int winner = 0;
        int maxLead = 0;

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();

            cumScore1 += s;
            cumScore2 += t;

            int currentLeader;
            int currentLead;

            if (cumScore1 > cumScore2) {
                currentLeader = 1;
                currentLead = cumScore1 - cumScore2;
            } else {
                currentLeader = 2;
                currenLead = cumScore2 - cumScore1;
            }

            if (currentLead > maxLead) {