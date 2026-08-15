import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Using System.out directly or PrintWriter with auto-flush
        PrintWriter out = new PrintWriter(System.out, true);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        long ans = 0;
        int i = 1;

        for (int j = 2; j <= n; j++) {
            while (i < j) {
                // Ask if distance between i and j is <= 1
                out.println("? " + i + " " + j);

                String response = sc.next();
                if (response.equals("Yes")) {
                    // All points from i to j - 1 are valid pairs with j
                    ans += (j - i);
                    break;
                } else {
                    // Point i is too far from j, advance i
                    i++;
                }
            }
        }

        // Print final answer and flush
        out.println("! " + ans);
        sc.close();
    }
}