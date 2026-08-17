import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    HashMap<String, Integer> hm = new HashMap<>();
    
    int N = sc.nextInt();
    int max = 0;
    for(int i=0; i<N; i++)
    {
      String input = sc.next();
      String s = input.toLowerCase();
      
    //   int curr = hm.getOrDefault(s, 1);
    //   if(curr > max)
    //   {
    //     max = curr;
    //   }

        if(hm.get(s) == null)
        {
            hm.put(s, 1);
        }else{
            hm.put(s, hm.get(s) + 1);
            int curr = hm.get(s);
            if(curr > max) {
                max = curr;
            }
        }
    }
    
    System.out.println(max);
  }
}