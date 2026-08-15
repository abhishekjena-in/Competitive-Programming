import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
            
            //extract first two 
            String ss1 = s.charAt(0) + s.charAt(1);
            int nn1 = Integer.parseInt(ss1);
            
            //extract second two 
            String ss2 = s.charAt(3) + s.charAt(4);
            int nn2 = Integer.parseInt(ss2);
            
            if(nn1 > 12) System.out.println("DD/MM/YYYY");
            if(nn1 < 13 && nn2 < 13) System.out.println("BOTH");
            if(nn2 > 12) System.out.println("MM/DD/YYYY");
        }
    }
}

13 local
12 local
nn1 local
ss1 local