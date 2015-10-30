import java.util.*;

public class CircleCity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        int count = 1;
        
       // System.out.println();
        while(count<=t)
        {
            int rsq = in.nextInt();
            
            int k = in.nextInt();
            
            int points;
            
            double j;
            
            double r = Math.sqrt(rsq);
        
            if(r == (int)r)
            {
            	points = 4;
            }
            else{
            	points = 0;
            }
            
            for(int i = 2;i<r;i++)
            {
                j = rsq - (i*i);
                
                if(Math.sqrt(j) == (int)Math.sqrt(j))
                    points+=4;
            }
            
            if(points<=k)
                System.out.println("possible");
            else
                System.out.println("impossible");
            count++;
        }
    }
}