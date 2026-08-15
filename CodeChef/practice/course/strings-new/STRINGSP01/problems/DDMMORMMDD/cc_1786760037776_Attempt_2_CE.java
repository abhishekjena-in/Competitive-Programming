import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
            
            //extract first two 
            char ch1 = s.charAt(0); char ch2 = s.charAt(1);
            String ss1 = ch1+ch2;
            int nn1 = Integer.parseInt(ss1);
            
            //extract second two 
            char ch1 = s.charAt(3); char ch2 = s.charAt(4);
            String ss2 = ch3+ch4;
            int nn2 = Integer.parseInt(ss2);
            
            if(nn1 > 12) System.out.println("DD/MM/YYYY");
            if(nn1 < 13 && nn2 < 13) System.out.println("BOTH");
            if(nn2 > 12) System.out.println("MM/DD/YYYY");
        }
    }
}

ch3 local
charAt local
ch2 local
char local
ch1 local
char keyword
Character keyword
CharSequence keyword
catch keyword