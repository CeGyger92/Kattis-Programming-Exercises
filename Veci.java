import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.*;



public class Veci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int answer = -1;
        boolean hasAnswer = false;
        for(int i = input+1; i <= 999999 && hasAnswer == false;i++)
        {
            if(Integer.toString(i).length() == Integer.toString(input).length())
            {
                String inputString = Integer.toString(input);
                String iValue = Integer.toString(i);
                boolean isSolution = true;
                for(int j = 0; j < inputString.length(); j++)
                {
                   int charCount1 = 0;
                   int charCount2 = 0;                   
                    for(int k = 0; k < inputString.length();k++)
                   {
                       if(inputString.charAt(j) == inputString.charAt(k))
                       {
                           charCount1++;
                       }
                   }
                   for(int k = 0; k < inputString.length();k++)
                   {
                       if(inputString.charAt(j) == iValue.charAt(k))
                       {
                           charCount2++;
                       }
                   }
                    
                    if(charCount1 != charCount2)
                    {
                        isSolution = false;
                    }
                }
                
                if(isSolution)
                {
                    System.out.print(i);
                    hasAnswer = true;
                }
            }
        }
        if(hasAnswer == false)
        {
            System.out.print("0");
        }
        
     }
}