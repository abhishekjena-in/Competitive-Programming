public class Main{
  public static void main(String[] args)
  {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    if(
      A+B == 9 ||
      A-B == 9 ||
      A*B == 9 ||
      A == 9*B){
        System.out.println("Nine");
      }
    else{
      System.out.println("Nein");
    }
  }
}