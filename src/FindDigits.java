import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        int count = 1;
        
        while(count<=t)
        {
            long n = in.nextLong();
            
            long backupN = n;
            
            int zeroes = (n+"").length()-1;
            
           // StringBuilder sb = new StringBuilder("1");
            
          //  for(int i = 0;i<zeroes;i++)
         //   {
         //       sb.append("0");
         //   }
            
           // System.out.println(sb.toString());
            
            long divisor = (long)Math.pow(10,zeroes);
                //Integer.parseInt(sb.toString());
            
            
         //   System.out.println("divisor = "+divisor);
            
            int counter = 0;
            while(n>0)
            {
               // System.out.println("value of n = "+n);
               // System.out.println("value of divisor = "+divisor);
                long q = n/divisor;
                
                if(q != 0 && backupN%q == 0)
                {
                    
                    counter++;
                }
                n = n%divisor;
                divisor = divisor/10;
            }   
            
            System.out.println(counter);
            count++;
        }
    }
}