package algos.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t;
        int sum1=0;
        int sum2=0;
        t = in.nextInt();
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                int val = in.nextInt();
                if(i==j){
                    sum1 += val;
                }
                if(i+j == t-1){
                    sum2 += val;
                }
            }
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
}