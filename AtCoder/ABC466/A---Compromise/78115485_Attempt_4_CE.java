import java.uytil.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] arr = new int[N];
    boolean flag = true; //assume all are negative only
    for(int i=0; i<N; i++)
    {
      arr[i] = sc.nextInt();
      if(arr[i]>-1)
        flag = false;
    }
    if(flag) System.out.println("Yes");
    else System.out.println("No");
  }
}