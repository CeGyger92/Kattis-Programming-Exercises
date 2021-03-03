import java.util.Scanner;

import java.util.Collections;

import java.util.ArrayList;



public class Battle {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            boolean complete = false;

            for(int i =0; i < input.length();)
            {
               if(i <= input.length()-3 && input.charAt(i) != input.charAt(i+1) && input.charAt(i) != input.charAt(i+2)
               && input.charAt(i+1) != input.charAt(i+2))
               {
                    System.out.print("C");
                    i +=3 ;
               }else{
                   if(input.charAt(i) == 'R')
                   {
                       System.out.print("S");
                   }else if(input.charAt(i) == 'B')
                   {
                        System.out.print("K");
                   }else if(input.charAt(i) == 'L')
                    {
                        System.out.print("H");
                    }
                    i++;
               }    
        
               
               
            }
    }
}