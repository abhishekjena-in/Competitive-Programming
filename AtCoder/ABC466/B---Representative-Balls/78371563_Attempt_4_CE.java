import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    int[] C = new int[N];
    int[] S = new int[N];
    
    int[] res = new int[M];
    Arrays.fill(res, -1);
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    for(int i=0; i<N; i++)
    {
      C[i] = sc.nextInt();
      S[i] = sc.nextInt();
      
      if(hm.get(C[i]) == null)
      {
        hm.put(C[i], S[i]);
      }else{
        int get = hm.get(C[i]);
        if(S[i] > get) hm.put(C[i], S[i]);
      }
    }
    
    for(Map.Entry<Integer, Integer> entry : hm.entrySet())
    {
      int key = entry.getKey();
      res[key] = entry.getValue(key);
    }
    
    for(int i=1; i<M+1; i++)
    {
      System.out.print(res[i]+" ");
    }
  }
}