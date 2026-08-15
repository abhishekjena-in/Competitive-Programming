import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
            
            //extract first two 
            int nn1 = (s.charAt(0) - '0')*10 + s.charAt(1) - '0';
            
            
            //extract second two 
            int nn2 = (s.charAt(3) - '0')*10 + s.charAt(4) - '0';
           
            
            if(nn1 > 12) System.out.println("DD/MM/YYYY");
            if(nn1 < 13 && nn2 < 13) System.out.println("BOTH");
            if(nn2 > 12) System.out.println("MM/DD/YYYY");
        }
    }
}

10 local