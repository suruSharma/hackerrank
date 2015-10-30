import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = "YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        
        if(inputString.length() == 2)
        {
            ans = "NO";
        }
        else{
            char[] alphabets = new char[26];
            
            for(int i=0;i<inputString.length();i++)
            {
                int arrayIndex = inputString.charAt(i)-'a';
                if(alphabets[arrayIndex] == 0)
                    alphabets[arrayIndex] = 1;
                else
                    alphabets[arrayIndex]++;
            }
            
            boolean oddFound = false;
            for(int i=0;i<alphabets.length;i++)
            {
                if(alphabets[i] %2 != 0)        
                {
                    if(oddFound)
                    {
                        ans = "NO";
                        break;
                    }
                    else
                        oddFound = true;
                }
            }
        }
        System.out.println(ans);
        myScan.close();
    }
}
