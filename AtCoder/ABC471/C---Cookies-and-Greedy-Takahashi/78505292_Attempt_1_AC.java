import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrLeft = new ArrayList<>();
        ArrayList<Integer> arrRight = new ArrayList<>();

        int N = sc.nextInt();
        for(int i=0; i<N; i++)
        {
            int input = sc.nextInt();
            if(input < 0) arrLeft.add(input);
            else arrRight.add(input);
        }

        Collections.sort(arrLeft, Collections.reverseOrder());
        Collections.sort(arrRight);

        int n= 0;
        int p= 0;

        long currentPos = 0;
        long totalDistance = 0;

        while(n < arrLeft.size() || p < arrRight.size())
        {
            //if both have values in them
            if(n < arrLeft.size() && p < arrRight.size())
            {
                long leftDist = Math.abs( arrLeft.get(n) - currentPos );
                long rightDist = Math.abs( arrRight.get(p) - currentPos );

                //if tie or left is closer , choose left
                if(leftDist <= rightDist)
                {
                    //pick smaller
                    totalDistance += leftDist;
                    currentPos = arrLeft.get(n);
                    n++;
                }
                else{
                    totalDistance += rightDist;
                    currentPos = arrRight.get(p);
                    p++;
                }
            }

            //if only left has values left
            else if(n < arrLeft.size())
            {
                totalDistance += Math.abs( arrLeft.get(n) - currentPos );
                currentPos = arrLeft.get(n);
                n++;
            }

            //if only right has values left
            else{
                totalDistance += Math.abs( arrRight.get(p) - currentPos );
                currentPos = arrRight.get(p);
                p++;
            }
        }

        System.out.println(totalDistance);
    }
}