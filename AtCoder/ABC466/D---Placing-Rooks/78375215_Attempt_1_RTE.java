import java.util.*;
class Main{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int N = sc.nextInt();   // NxN matrix
        int M = sc.nextInt();   // operations

        int[][] arr = new int[N+1][N+1];
        

        // 0 -> means empty cells
        // 1 -> means filled cells

        for(int op=0 ; op<M; op++)
        {
            int Ri = sc.nextInt();
            int Ci = sc.nextInt();

            for(int col=0; col<=N; col++)
            {
                arr[Ri][col] = 0;
            }

            for(int row=0; row<=N; row++)
            {
                arr[row][Ci] = 0;
            }

            arr[Ri][Ci] = 1;
        }

        int totalPieces = 0;
        for(int i =1; i<=N; i++)
        {
            for(int j= 1; j<=N; j++)
            {
                System.out.print(arr[i][j] + " ");
                if(arr[i][j] == 1)
                {
                    totalPieces++;
                }
            }
            System.out.println();
        }

        System.out.println("\nAns: "+totalPieces);
    }
}